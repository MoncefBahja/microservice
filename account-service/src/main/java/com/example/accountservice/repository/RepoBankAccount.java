package com.example.accountservice.repository;

import com.example.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoBankAccount extends JpaRepository<BankAccount,String> {

}
