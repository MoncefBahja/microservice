package com.example.customerservice.web;

import com.example.customerservice.config.CustomerConfig;
import com.example.customerservice.config.GlobalConfig;
import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.RepoCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RefreshScope//
public class CustomerTestControllerConfig {



        /*
           @Value("${global.params.p1}")
            int p1;
            @Value("${global.params.p2}")
            int p2;
            @Value("${etudiant.params.x}")
            int x;
            @Value("${etudiant.params.y}")
            int y;

            @GetMapping("/testConfig")
            public Map<String, Integer> configTest(){
                return Map.of("p1",p1, "p2",p2, "x",x, "y",y);

            }


         */
        @Autowired
        private RepoCustomer repoCustomer;
        @Autowired
        private GlobalConfig globalConfig;
        @Autowired
        private CustomerConfig customerConfig;

        @GetMapping("/globalConfig")
        public GlobalConfig globalConfig() {
            return globalConfig;
        }

        @GetMapping("/customerConfig")
        public CustomerConfig customerConfig() {
            return customerConfig;
        }


     /*   @GetMapping("/customer")
        public List<Customer> findall() {

            return repoCustomer.findAll();
        }

        @GetMapping("/customer/{id}")
        public Customer findById(@PathVariable Long id) {
            return repoCustomer.findById(id).get();
        }*/
    }
