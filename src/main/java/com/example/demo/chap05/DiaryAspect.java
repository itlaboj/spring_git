package com.example.demo.chap05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DiaryAspect {

	@Autowired
	private User u;
	
	@Around("execution(* com.example.demo.chap05.DiaryController.test(..))")
	public Object advise01(ProceedingJoinPoint jp) throws Throwable {
		Object o = jp.proceed(); //引数に渡されたメソッドを実行する準備をする
		
		if (u == null || u.getName() == null) {
			o = "redirect:/diary"; //ログインできない場合の処理
			System.err.println("ログインできていないです");
		}
		
		
		return o; //実行
	}
}
