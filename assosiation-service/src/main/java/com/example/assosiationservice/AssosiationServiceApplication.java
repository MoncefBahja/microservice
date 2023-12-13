package com.example.assosiationservice;

import com.example.assosiationservice.entities.Assosiation;
import com.example.assosiationservice.repo.RepoAssosiation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class AssosiationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssosiationServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner (RepoAssosiation repoAssosiation){
        return args -> {
            Assosiation assosiation = Assosiation.builder()
                    .idAccount("bdc977ff-4f47-4e1e-971d-f06ffc394ffe")
                    .idCustomer(2L)
                    .build() ;
                  repoAssosiation.save(assosiation) ;

        } ;
    }
}
