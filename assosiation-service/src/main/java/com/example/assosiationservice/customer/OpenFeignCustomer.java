package com.example.assosiationservice.customer;

import com.example.assosiationservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="CUSTOMER-SERVER")

public interface OpenFeignCustomer {
        @GetMapping("/customer/{id}")
        public Customer findByIdCustomer(@PathVariable Long id) ;
}

