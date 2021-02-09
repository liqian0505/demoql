package com.cvicse.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ContractRepositoryTest {
    @Autowired
    ContractRepository repository;

    @Test
    public void countTest() throws Exception {
        System.out.println(repository.count());
    }
}