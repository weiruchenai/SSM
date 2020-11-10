package com.zjut.service.impl;

import com.zjut.dao.AccountDao;
import com.zjut.domain.Account;
import com.zjut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier(value = "accountDao")
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户...");
        List<Account> list = accountDao.findAll();
        System.out.println(list);
        return list;
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层保存账户...");
        accountDao.save(account);
        System.out.println("业务层保存账户成功...");
    }
}
