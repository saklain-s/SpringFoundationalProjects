package com.saklain.aopdemo.dao;


import com.saklain.aopdemo.Account;


public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}

