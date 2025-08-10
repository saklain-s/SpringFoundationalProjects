package com.saklain.aopdemo.aspect;

import com.saklain.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

     @Before("com.saklain.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint thejoinPoint) {
         System.out.println("\n=====>>> Execution @Before advice on method");


         // display the method signature
         MethodSignature methodSignature = (MethodSignature) thejoinPoint.getSignature();
         System.out.println("Method: " + methodSignature);

         // display method arguments

         // get args
         Object[] args = thejoinPoint.getArgs();

         // lop thru args
         for (Object tempArg : args){
             System.out.println(tempArg);

             if (tempArg instanceof Account){

                 // downcast and print Account specific stuff
                 Account theAccount = (Account) tempArg;

                 System.out.println("account name: "+theAccount.getName());
                 System.out.println("account level: "+theAccount.getLevel());
             }
         }
     }
}
