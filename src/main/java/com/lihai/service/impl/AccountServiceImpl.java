package com.lihai.service.impl;

import com.lihai.dao.AccountDao;
import com.lihai.entity.Account;
import com.lihai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao dao;

    public Account findUserByPhone(String phone) {
        return dao.findUserByPhone(phone);
    }
}