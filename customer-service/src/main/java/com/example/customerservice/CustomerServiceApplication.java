package com.example.customerservice;

import com.example.customerservice.config.CustomerConfig;
import com.example.customerservice.config.GlobalConfig;
import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.RepoCustomer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
@EnableConfigurationProperties({GlobalConfig.class, CustomerConfig.class})
@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);
	}
    @Bean
     CommandLineRunner commandLineRunner (RepoCustomer repoCustomer) {
        return args -> {
            Customer customer1 = Customer.builder()
                    .firstName("moncef")
                    .lastName("bahja")
                    .email("moncefbahja@gmail.com")
                    .build() ;
            Customer customer2 = Customer.builder()
                    .firstName("moncef")
                    .lastName("bahja")
                    .email("moncefbahja@gmail.com")
                    .build() ;

            repoCustomer.save(customer1) ;
            repoCustomer.save(customer2) ;

        } ;
    }

}




