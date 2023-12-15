package com.example.assosiationservice.customer;
import com.example.assosiationservice.model.BankAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "ACCOUNT-SERVICE")
public interface OpenFeignBankAccount {

    @GetMapping("/bankAccount")
    public List<BankAccount> findAllAccount() ;
    @GetMapping("/bankAccount/{id}")
    public BankAccount findByIdAccount(@PathVariable String id) ;
}

