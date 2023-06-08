package com.example.demo.chap05;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@SessionScope
@Component
@Data
public class Count {
	//フィールド
	private int num; //カウント値を格納する
}
