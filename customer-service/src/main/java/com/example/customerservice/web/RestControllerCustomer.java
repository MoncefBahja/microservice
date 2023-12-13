package com.example.customerservice.web;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.RepoCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllerCustomer {
    @Autowired
    private RepoCustomer repoCustomer ;

   @GetMapping("/customer")
    public List<Customer> listCustomer() {
       return  repoCustomer.findAll() ;
   }

   @GetMapping("/customer/{id}")
    public Customer customerById (@PathVariable("id") Long id) {
       return repoCustomer.findById(id).get() ;
   }

  // @PostMapping("/customer")
 //   public void postCustomer (@RequestBody Customer customer) {
 //      Customer c = new Customer() ;
  //     c.setFirstName(customer.getFirstName());

  //     repoCustomer.save(c) ;
  // }









}
