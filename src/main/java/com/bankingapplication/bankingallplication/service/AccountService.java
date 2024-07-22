package com.bankingapplication.bankingallplication.service;

import java.util.List;

import com.bankingapplication.bankingallplication.dto.AccountDto;

public interface AccountService {
    abstract AccountDto createAccount(AccountDto account);

    abstract AccountDto getAccountById(Long id); 

    abstract AccountDto deposit(Long id, Double amount);

    abstract AccountDto withdraw(Long id, Double amount);

    abstract List<AccountDto> getAllAccounts(); 

    abstract void deleteAccount(Long id);
}
