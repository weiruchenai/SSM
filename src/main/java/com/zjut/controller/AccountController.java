package com.zjut.controller;

import com.zjut.domain.Account;
import com.zjut.service.AccountService;
import com.zjut.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/springmvc")
public class AccountController {

    @Autowired
    @Qualifier(value = "accountService")
    private AccountService accountService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("表现层的SpringMVC的测试方法运行了...");
        return "success";
    }

    @RequestMapping("/ssmTest")
    public String ssmTest(ModelMap modelMap){
        System.out.println("表现层的SpringMVC的方法运行了...");
        List<Account> list = accountService.findAll();
        modelMap.addAttribute("accountList", list);
        return "success";
    }

    @RequestMapping("/save")
    public String Save(Account account){
        System.out.println("表现层的SpringMVC的方法运行了...");
        accountService.save(account);
        return "success";
    }
}
