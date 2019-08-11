package com.lihai.dao;

import com.lihai.entity.Account;

public interface AccountDao {

    Account findUserByPhone(String phone);
}