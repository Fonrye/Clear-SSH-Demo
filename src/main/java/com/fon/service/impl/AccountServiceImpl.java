package com.fon.service.impl;

import com.fon.dao.AccountDao;
import com.fon.entity.AccountEntity;
import com.fon.service.AccountService;
import org.springframework.transaction.annotation.Transactional;


public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    @Transactional
    public void addUser(AccountEntity user) {
        accountDao.save(user);
    }
}
