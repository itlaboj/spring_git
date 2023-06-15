package com.example.demo.chap06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ShirotoAspect {

	@Around("execution(* com.example.demo.chap06.OkadaController.step*(..))")
	public Object advise05(ProceedingJoinPoint jp) throws Throwable {
		System.err.println("処理前");
		
		Object o = jp.proceed(); //引数に渡されたメソッドを実行する
		
		System.err.println("処理後");
		
		return o;
	}
	
//	@Before("execution(* com.example.demo.chap06.OkadaController.step*(..))")
//	public void advise01(JoinPoint jp) {
//		System.err.println("アドバイス１");
//		System.err.println(jp.getSignature());
//	}
//
//	@After("execution(* com.example.demo.chap06.OkadaController.step*(..))")
//	public void advise02(JoinPoint jp) {
//		System.err.println("アドバイス２");
//		System.err.println(jp.getSignature());
//	}
//
//	@AfterReturning("execution(* com.example.demo.chap06.OkadaController.step*(..))")
//	public void advise03(JoinPoint jp) {
//		System.err.println("アドバイス３");
//		System.err.println(jp.getSignature());
//	}
//
//	@AfterThrowing(
//			value = "execution(* com.example.demo.chap06.OkadaController.step*(..))",
//			throwing = "e"
//	)
//	public void advise04(JoinPoint jp, Exception e) {
//		System.err.println("アドバイス４");
//		System.err.println(jp.getSignature());
//	}
}
