package controller;

import templatetest.Client;


import java.util.Collection;

public interface  ClientService {

     void createOrUpdateClient(Integer id, Client client) ;



     void deleteCustomer(Integer id) ;


         Collection<Client> getClients();

}