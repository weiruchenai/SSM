package com.zjut.dao;

import com.zjut.domain.Account;
import org.springframework.stereotype.Repository;

import javax.naming.MalformedLinkException;
import java.util.List;

@Repository(value = "accountDao")
public interface AccountDao {
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
