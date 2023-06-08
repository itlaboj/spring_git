package com.example.demo.chap05;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@SessionScope
@Component
@Data
public class User {
	//フィールド
	private String name; //名前を格納する
}
