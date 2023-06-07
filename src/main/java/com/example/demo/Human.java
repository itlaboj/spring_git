package com.example.demo;

import lombok.Data;

@Data
public class Human {
	//フィールド
	private String name;
	private int age;
	
	//コンストラクタ
	public Human() {
		
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
