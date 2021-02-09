package com.cvicse.demo.repository;

import com.cvicse.demo.model.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {

    public Client findByClientId(String clientId);

}
