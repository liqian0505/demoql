package com.cvicse.demo.resolver;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.cvicse.demo.model.Risk;
import com.cvicse.demo.model.Contract;
import com.cvicse.demo.repository.ContractRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class RiskResolver implements GraphQLResolver<Risk> {
    @Autowired
    private ContractRepository contractRepository;

    public Optional<Contract> getContract(Risk risk){
        return contractRepository.findByContractId(risk.getContractId());
    }
}
