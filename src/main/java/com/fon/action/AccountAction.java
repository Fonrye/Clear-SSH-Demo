package com.fon.action;

import com.fon.entity.AccountEntity;
import com.fon.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class AccountAction extends ActionSupport {
  private AccountService userService;

  public void setUserService(AccountService userService) {
    this.userService = userService;
  }

  public String add() {
    AccountEntity user = new AccountEntity();
    user.setAccount("lisi");
    user.setName("李四");
    user.setPassword("123456");
    user.setPhone("13533170914");
    user.setEmail("1220174424@qq.com");
    user.setCreateUserId(1L);
    user.setCreateTime(new Date());
    userService.addUser(user);
    return "success";
  }
}
