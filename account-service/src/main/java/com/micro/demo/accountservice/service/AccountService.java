package com.micro.demo.accountservice.service;

import com.micro.demo.accountservice.entity.Account;
import com.micro.demo.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;


@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account get(String id){
        return accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Account save(Account account){
        return accountRepository.save(account);
    }

    public Account update(String id, Account account){
        Assert.isNull(id, "Id cannot be null");
        return accountRepository.save(account);
    }

    public void delete(String id){
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
