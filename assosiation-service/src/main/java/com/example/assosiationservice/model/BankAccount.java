package com.example.assosiationservice.model;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BankAccount {
    private String accountId ;
    private  double balance ;
    private LocalDate createAt ;
    private String currency ;

}
