package com.cvicse.demo.resolver;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.cvicse.demo.model.Client;
import com.cvicse.demo.model.Contract;
import com.cvicse.demo.model.Risk;
import com.cvicse.demo.repository.ClientRepository;
import com.cvicse.demo.repository.RiskRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ContractResolver implements GraphQLResolver<Contract> {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private RiskRepository riskRepository;

    public Client getClient(Contract contract) {
        return clientRepository.findByClientId(contract.getClientId());
    }

    public Iterable<Risk> getRisks(Contract contract) {
        return riskRepository.findByContractIdOrderByDateDesc(contract.getContractId());

    }

    public Risk getLatestRisk(Contract contract){
        return getRisks(contract).iterator().next();
    }
}