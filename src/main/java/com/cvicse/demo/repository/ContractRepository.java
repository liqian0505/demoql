package com.cvicse.demo.repository;

import java.util.Optional;

import com.cvicse.demo.model.Contract;

import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, String> {

    public Optional<Contract> findByContractId(String contractId);
}
