package com.example.accountservice.model;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Builder
public class Customer {
    private   Long id ;
    private   String firstName ;
    private   String lastName ;
    private String email ;
}
