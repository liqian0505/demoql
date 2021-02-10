package com.cvicse.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.cvicse.demo.model.Balance;
import com.cvicse.demo.model.Client;
import com.cvicse.demo.model.Contract;
import com.cvicse.demo.model.Risk;
import com.cvicse.demo.repository.BalanceRepository;
import com.cvicse.demo.repository.ClientRepository;
import com.cvicse.demo.repository.RiskRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ContractResolver implements GraphQLResolver<Contract> {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private RiskRepository riskRepository;
    @Autowired
    private BalanceRepository balanceRepository;

    public Client getClient(Contract contract) {
        return clientRepository.findByClientId(contract.getClientId());
    }

    public Iterable<Risk> getRisks(Contract contract) {
        return riskRepository.findByContractIdOrderByDateDesc(contract.getContractId());

    }

    public Risk getLatestRisk(Contract contract){
        return getRisks(contract).iterator().next();
    }

    public Iterable<Balance> getBalances(Contract contract){
        return balanceRepository.findByContractId(contract.getContractId());
    }
}