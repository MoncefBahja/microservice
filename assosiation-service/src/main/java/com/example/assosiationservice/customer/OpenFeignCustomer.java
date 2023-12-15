package com.example.assosiationservice.customer;

import com.example.assosiationservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="CUSTOMER-SERVICE")
public interface OpenFeignCustomer {

        @GetMapping("/customer")
        public List<Customer> findAllCustomer() ;
        @GetMapping("/customer/{id}")
        public Customer findByIdCustomer(@PathVariable Long id) ;
}

