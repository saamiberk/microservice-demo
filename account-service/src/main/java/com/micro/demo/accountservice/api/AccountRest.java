package com.micro.demo.accountservice.api;

import com.micro.demo.accountservice.entity.Account;
import com.micro.demo.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountRest {
    @Autowired
    AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Account> update(@PathVariable("id") String id, @RequestBody Account account){
        return ResponseEntity.ok(accountService.update(id, account));
    }
    @DeleteMapping
    public void delete(String id){
        accountService.delete(id);
    }

    @GetMapping
    public List<Account> findAll(){
        return accountService.findAll();
    }

}
