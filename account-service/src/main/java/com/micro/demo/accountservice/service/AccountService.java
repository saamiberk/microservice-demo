package com.micro.demo.accountservice.service;

import com.micro.demo.accountservice.entity.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account get(String id){
        return new Account("test-id");
    }

    public Account save(Account account){
        return new Account("test-id");
    }

    public Account update(Account account){
        return new Account("test-id");
    }

    public void delete(String id){
    }
}
