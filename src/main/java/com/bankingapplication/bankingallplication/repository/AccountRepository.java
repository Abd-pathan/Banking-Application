package com.bankingapplication.bankingallplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingapplication.bankingallplication.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
    
}
