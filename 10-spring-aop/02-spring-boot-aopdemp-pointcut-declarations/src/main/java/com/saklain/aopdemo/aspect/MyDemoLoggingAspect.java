package com.saklain.aopdemo.aspect;

import com.saklain.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Around("execution(* com.saklain.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(
            ProceedingJoinPoint theProceedingJointPoint) throws Throwable{

        // print out method we are advising on
        String method = theProceedingJointPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @Around on method: "+method);

        // get begin timestamp
        long begin = System.currentTimeMillis();

        // now, let's execute the method
        Object result = null;
        try {
            result = theProceedingJointPoint.proceed();
        }
        catch (Exception exc){
            // log the exception
            System.out.println(exc.getMessage());

            // rethrow the exception
            throw exc;

//            // give user a custom message
//            result = "Major accident! But no worries, your private AOP helicopter is on the way!";

        }


        // get end timestamp
        long end = System.currentTimeMillis();

        // compute duration and display it
        long duration = end - begin;
        System.out.println("\n========> Duration: "+duration / 1000.0+" seconds");

        return result;
    }


    @After(
            "execution(* com.saklain.aopdemo.dao.AccountDAO.findAccounts(..))"
    )
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint){

        // print out which method we are adivising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @After(finally) on method: "+method);

    }

    @AfterThrowing(
            pointcut = "execution(* com.saklain.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "theExc"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExc){
        // print out which method we are adivising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @AfterThrowing on method: "+method);

        // log the exception
        System.out.println("\n==========> The Exception is: "+theExc );

    }

    // add a new advice for @AfterReturning on the findAccounts method

    @AfterReturning(
            pointcut = "execution(* com.saklain.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result")

    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result){
        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @AfterReturning on method: "+method);

        // print out the results of the method call
        System.out.println("\n==========> result is: "+result);

        // let's post-process the data ... lets' modify it: -)


        // convert the account names to uppercase
        convertAccountNamesToUpperCase(result);

        System.out.println("\n==========> result is: "+result);

    }

    private void convertAccountNamesToUpperCase(List<Account> result) {

        // loop through accounts
        for (Account tempAccount : result) {
            // get uppercase version of name
            String theUpperName = tempAccount.getName().toUpperCase();

            // update the name on the account
            tempAccount.setName(theUpperName);
        }
    }

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
