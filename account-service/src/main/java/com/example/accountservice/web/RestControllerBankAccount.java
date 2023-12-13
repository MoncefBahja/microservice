package com.example.accountservice.web;

import com.example.accountservice.entities.BankAccount;
import com.example.accountservice.repository.RepoBankAccount;
import com.example.customerservice.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
//@RequestMapping("/api")
public class RestControllerBankAccount {
    @Autowired
    RepoBankAccount repoBankAccount ;



    @GetMapping("/bankAccount")
    public List<BankAccount> listAllBankAccount () {

        return  repoBankAccount.findAll() ;





    }
    @GetMapping("/bankAccount{id}")
    public BankAccount bankAccountById (@PathVariable("id") String id){
 return  repoBankAccount.findById(id).get();

    }








}
