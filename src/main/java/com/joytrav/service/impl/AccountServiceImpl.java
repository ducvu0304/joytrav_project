package com.joytrav.service.impl;

import com.joytrav.repository.AccountRepository;
import com.joytrav.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements com.joytrav.service.AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> fetchALl() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(Integer integer) {
        return null;
    }

    @Override
    public void create(Account account) {

    }

    @Override
    public void save() {

    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }
}
