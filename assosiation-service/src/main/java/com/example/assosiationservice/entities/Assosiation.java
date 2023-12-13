package com.example.assosiationservice.entities;

import com.example.assosiationservice.model.Customer;
import com.example.assosiationservice.model1.BankAccount;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @ToString @Builder @AllArgsConstructor @NoArgsConstructor

public class Assosiation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssosiation ;
    private String idAccount ;
    private Long idCustomer ;
    @Transient
    private Customer customer ;
    @Transient
    private BankAccount bankAccount ;
}
