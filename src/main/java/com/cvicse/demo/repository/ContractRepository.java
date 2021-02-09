package com.cvicse.demo.repository;

import com.cvicse.demo.model.Contract;

import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, String> {

}
