package com.nyse.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by TT on 8.11.2015 г..
 */


@Aspect
@Component
public class MyAspect {


    @Around("execution(* *com.*.*.CompanyIndustryDaoImpl.get*(..))")
    public List<Object> getAllCatsAroundMethod(ProceedingJoinPoint pjp){

        List<Object> list = null;

        try {

            System.out.println("Bofore "+pjp.getSignature());
            list = (List<Object>)pjp.proceed();
            System.out.println("After "+pjp.getSignature());

        }catch (Throwable e){
            System.out.println("Proceed exception! "+e.getMessage());
        }

        return  null;
    }


}
