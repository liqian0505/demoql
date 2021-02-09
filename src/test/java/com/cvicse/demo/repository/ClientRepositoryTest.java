package com.cvicse.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientRepositoryTest {
    @Autowired
    ClientRepository repository;

    @Test
    public void countTest() throws Exception {
        System.out.println(repository.count());
    }
}
