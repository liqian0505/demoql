package com.cvicse.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.cvicse.demo.model.Client;
import com.cvicse.demo.model.Contract;
import com.cvicse.demo.repository.ClientRepository;
import com.cvicse.demo.repository.ContractRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class Query implements GraphQLQueryResolver {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ContractRepository contractRepository;

    public Iterable<Client> findAllClients() {
        return clientRepository.findAll();
    }

    public Iterable<Contract> findAllContracts() {
        return contractRepository.findAll();
    }
}
