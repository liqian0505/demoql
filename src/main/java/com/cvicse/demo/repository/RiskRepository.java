package com.cvicse.demo.repository;

import com.cvicse.demo.model.Risk;

import org.springframework.data.repository.CrudRepository;

public interface RiskRepository extends CrudRepository<Risk, String> {
    public Iterable<Risk> findByContractIdOrderByDateDesc(String contractId);
}