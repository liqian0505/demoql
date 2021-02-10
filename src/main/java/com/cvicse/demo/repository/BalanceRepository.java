package com.cvicse.demo.repository;

import com.cvicse.demo.model.Balance;

import org.springframework.data.repository.CrudRepository;

public interface BalanceRepository extends CrudRepository<Balance, String>{

    public Iterable<Balance> findByContractId(String contractId);
    
}
