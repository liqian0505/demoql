package com.cvicse.demo.resolver;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.cvicse.demo.model.Client;
import com.cvicse.demo.model.Contract;
import com.cvicse.demo.model.Risk;
import com.cvicse.demo.repository.ClientRepository;
import com.cvicse.demo.repository.ContractRepository;
import com.cvicse.demo.repository.RiskRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class Query implements GraphQLQueryResolver {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private RiskRepository riskRepository;

    public Iterable<Client> allClients() {
        return clientRepository.findAll();
    }

    public Iterable<Contract> allContracts() {
        return contractRepository.findAll();
    }

    public Iterable<Risk> latestRisks(String level){
        return riskRepository.findLastestRisks(level);
    }

    public Optional<Contract> contract(String contractId){
        return contractRepository.findByContractId(contractId);
    }
}
