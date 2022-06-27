package com.rajaaidrissi.ebankingbackend.repositories;

import com.rajaaidrissi.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
