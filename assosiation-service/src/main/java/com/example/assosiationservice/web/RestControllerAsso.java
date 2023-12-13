package com.example.assosiationservice.web;

import com.example.assosiationservice.bankAccount.OpenFeignBankAccount;
import com.example.assosiationservice.customer.OpenFeignCustomer;
import com.example.assosiationservice.entities.Assosiation;
import com.example.assosiationservice.model.Customer;
import com.example.assosiationservice.model1.BankAccount;
import com.example.assosiationservice.repo.RepoAssosiation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerAsso {
    @Autowired
    RepoAssosiation repoAssosiation ;
    @Autowired
    OpenFeignCustomer openFeignCustomer ;
    @Autowired
    OpenFeignBankAccount openFeignBankAccount ;

    @GetMapping("/asso/{id}")
    public Assosiation findByIdAsso(@PathVariable Long id) {
        Assosiation assosiation= repoAssosiation.findById(id).get() ;
        Customer customer = openFeignCustomer.findByIdCustomer(assosiation.getIdCustomer()) ;


        assosiation.setCustomer(customer);
        return  assosiation ;
    }
}
