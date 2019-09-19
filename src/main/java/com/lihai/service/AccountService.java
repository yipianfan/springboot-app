package com.lihai.service;

import com.lihai.entity.Account;

public interface AccountService {

    Account findUserByPhone(String phone);
}