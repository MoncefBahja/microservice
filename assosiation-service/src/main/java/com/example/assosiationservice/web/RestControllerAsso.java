package com.example.assosiationservice.web;

import com.example.assosiationservice.customer.OpenFeignBankAccount;
import com.example.assosiationservice.customer.OpenFeignCustomer;
import com.example.assosiationservice.entities.Assosiation;
import com.example.assosiationservice.model.BankAccount;
import com.example.assosiationservice.model.Customer;
import com.example.assosiationservice.repo.RepoAssosiation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

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
        BankAccount bankAccount = openFeignBankAccount.findByIdAccount(assosiation.getIdAccount());
        assosiation.setBankAccount(bankAccount);
        Customer customer = openFeignCustomer.findByIdCustomer(assosiation.getIdCustomer()) ;
        assosiation.setCustomer(customer);
        return  assosiation ;
    }

    @GetMapping("/asso")
    public List<Assosiation> getAllAcheteur () {
        List<Customer> lc = openFeignCustomer.findAllCustomer()  ;
        List<Assosiation> la = repoAssosiation.findAll() ;
        List<BankAccount> lb = openFeignBankAccount.findAllAccount() ;
        for (Assosiation a: la){
            for(Customer p :lc){
                if(Objects.equals(a.getIdCustomer(), p.getId())){
                    a.setCustomer(p); break;}}}


        for (Assosiation a: la){
            for(BankAccount b :lb){
                if(Objects.equals(a.getIdAccount(), b.getAccountId())){
                    a.setBankAccount(b); break;}}}
        return la ;
    }
}
