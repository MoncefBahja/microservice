package com.example.accountservice;

import com.example.accountservice.entities.BankAccount;
import com.example.accountservice.repository.RepoBankAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;
@SpringBootApplication
public class AccountServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner (RepoBankAccount repoBankAccount){
        return args->{
            BankAccount bankAccount1 = BankAccount.builder()
                    .accountId("A")
                    .balance(12000)
                    .currency("DH")
                    .createAt(LocalDate.now())
                    .build();

   repoBankAccount.save(bankAccount1) ;
            BankAccount bankAccount2 = BankAccount.builder()
                    .accountId("B")
                    .balance(20000)
                    .currency("DH")
                    .createAt(LocalDate.now())
                    .build();

            repoBankAccount.save(bankAccount2) ;




        } ;

}


}
