package com.saklain.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with a @Before advice
    // @Before("execution(public void updateAccount())")
    //     @Before("execution(public void com.saklain.aopdemo.dao.AccountDAO.addAccount())") this adds to a particular method only
    // @Before("execution(public void add*())") add to every method that starts with the name add
    // @Before("execution( void add*())") // applied to only void modifier classes
    @Before("execution(* add*())") // applied to only void modifier classes
  public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Execution @Before advice on method");
    }
}
