package com.saklain.aopdemo.dao;


import com.saklain.aopdemo.Account;

import java.util.List;


public interface AccountDAO {
    List<Account> findAccounts();

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

    List<Account> findAccounts(boolean tripWire);
}

