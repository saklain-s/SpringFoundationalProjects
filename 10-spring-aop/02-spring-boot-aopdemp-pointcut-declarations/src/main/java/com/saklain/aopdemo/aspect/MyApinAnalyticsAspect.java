package com.saklain.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApinAnalyticsAspect {
    @Before("com.saklain.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void performApiAnalytics(){
        System.out.println("\n=====>>> Performing API analytics");
    }
}
