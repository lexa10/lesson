package controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import jdk.nashorn.internal.objects.annotations.Setter;
import templatetest.Client;
import templatetest.ClientRepository;

import java.util.Collection;

public class ClientServiceImpl implements ClientService {
    @Setter(onMethod_ = {@Autowired})
    private ClientRepository clientRepository;

    @Override
    public void createOrUpdateClient(Integer id, Client client) {
        if (!clientRepository.isPresent(id)) {
            clientRepository.save(client);
        } else clientRepository.update(client);
    }

    @Override
    public void deleteCustomer(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Collection<Client> getClients() {
        return clientRepository.findAll();
    }
}