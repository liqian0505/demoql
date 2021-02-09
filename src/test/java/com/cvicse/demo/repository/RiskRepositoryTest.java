package com.cvicse.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RiskRepositoryTest {
    @Autowired
    RiskRepository repository;

    @Test
    public void countTest() throws Exception {
        System.out.println(repository.findByContractIdOrderByDateDesc("001-0000019-001"));
    }
}