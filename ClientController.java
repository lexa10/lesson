package controller;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.drsdgdbye.jdbctemplatetest.entities.Client;
import ru.drsdgdbye.jdbctemplatetest.services.ClientService;
import templatetest.Client;

public class ClientController {
    @Setter(onMethod_ = {@Autowired})
    ClientService clientServiceService;

    @RequestMapping(value = "/clients")
    public ResponseEntity<Object> getCustomers() {
        return new ResponseEntity<>(clientService.getClients(), HttpStatus.OK);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    public ResponseEntity<Object> createClient(@RequestBody Client client) {
        clientService.createOrUpdateClient(client.getId(), client);
        return new ResponseEntity<>("Product is created", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateProduct(@PathVariable("id") String id, @RequestBody Client client) {
        clientService.createOrUpdateClient(Integer.parseInt(id), client);
        return new ResponseEntity<>("client is updated", HttpStatus.OK);
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        clientService.deleteClient(Integer.parseInt(id));
        return new ResponseEntity<>("client is deleted", HttpStatus.OK);
    }

}
