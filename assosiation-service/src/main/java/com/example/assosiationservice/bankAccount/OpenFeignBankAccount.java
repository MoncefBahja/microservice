package com.example.assosiationservice.bankAccount;

import com.example.assosiationservice.model.Customer;
import com.example.assosiationservice.model1.BankAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "ACCOUNT-SERVER")
public interface OpenFeignBankAccount {
    @GetMapping("/account/{id}")
    public BankAccount findByIdAccount(@PathVariable String id) ;
}

