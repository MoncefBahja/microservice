package com.example.accountservice.entities;

import com.example.customerservice.entities.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Entity
public class BankAccount {
    @Id
    private String accountId ;
    private  double balance ;
    private LocalDate createAt ;
    private String currency ;






}
