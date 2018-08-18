package com.aartek.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Allaspects 
{
	
	@Pointcut("execution(* com.aartek.aop.MyBookService*.*(..))")
	public void businessMethods() {
    	System.out.println("Pointcut: ");
    }
	@Before("businessMethods()")
	public void before()
	{
		System.out.println("Before");
	}
	
	@After("businessMethods()")
	public void after()
	{
		System.out.println("After");
	}
	
	@AfterThrowing("businessMethods()")
	public void afterThrowing()
	{
		System.out.println("After Throwing ");
	}
	
	/*@Around("businessMethods()")
	public void around()
	{
		System.out.println("Around: looking around");
    }*/
	
	

}
