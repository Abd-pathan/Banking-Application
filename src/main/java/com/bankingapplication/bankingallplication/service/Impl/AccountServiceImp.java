package com.bankingapplication.bankingallplication.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bankingapplication.bankingallplication.dto.AccountDto;
import com.bankingapplication.bankingallplication.entity.Account;
import com.bankingapplication.bankingallplication.mapper.AccountMapper;
import com.bankingapplication.bankingallplication.repository.AccountRepository;
import com.bankingapplication.bankingallplication.service.AccountService;

@Service
public class AccountServiceImp implements AccountService
{

    AccountRepository accountRepository;
    
    public AccountServiceImp(AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }


    @Override
    public AccountDto createAccount(AccountDto accountDto) {

        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }


    @Override
    public AccountDto getAccountById(Long id) {
    
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Accuont does not exists")); 
        return AccountMapper.mapToAccountDto(account);
    }


    @Override
    public AccountDto deposit(Long id, Double amount) {
       
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Accuont does not exists")); 
        double totalBalance =account.getBalance() + amount ;
        account.setBalance(totalBalance);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }


    @Override
    public AccountDto withdraw(Long id, Double amount) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Accuont does not exists")); 
       if(account.getBalance()<amount){
        throw new RuntimeException("Insufficient Balance");
       }
       double totalBalance =account.getBalance() - amount ;
       account.setBalance(totalBalance);
       Account savedAccount = accountRepository.save(account);
       return AccountMapper.mapToAccountDto(savedAccount);

    }


    @Override
    public List<AccountDto> getAllAccounts() {
       return accountRepository.findAll().stream().map((account)->AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
    }


    @Override
    public void deleteAccount(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Accuont does not exists")); 
        accountRepository.delete(account);
    }
    
}
