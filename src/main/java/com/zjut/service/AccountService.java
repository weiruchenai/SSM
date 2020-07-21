package com.zjut.service;

import com.zjut.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * @Description: 返回所有Account
     * @return: java.util.List<com.zjut.domain.Account>
     */
    List<Account> findAll();

    /**
     * @Description: 保存账户信息
     * @Param: [account]
     */
    void save(Account account);
}
