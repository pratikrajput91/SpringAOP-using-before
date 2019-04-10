package com.capgemini.spring.math.aspect;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;




@Component
@Aspect
public class ValidationAspect {
	@Before("execution(* com.capgemini.spring.math.impl.CalculatorImpl.add(..))")
	public void printAdd()
	{
		System.out.println("addition aspect done");
	
	
	}
	@Before("execution(* com.capgemini.spring.math.impl.CalculatorImpl.divide(..))")
	public void printDivide() {
		System.out.println("division aspect done");

	}
}
	