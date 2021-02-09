package com.cvicse.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.cvicse.demo.model.Client;
import com.cvicse.demo.model.Contract;
import com.cvicse.demo.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ContractResolver implements GraphQLResolver<Contract> {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClient(Contract contract) {
        return clientRepository.findByClientId(contract.getClientId());
    }
}
