package com.example.demo;

import lombok.Getter;
import lombok.Setter;

public class Item {
	//フィールド
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int price;
	
	//コンストラクタ
	public Item() {
		
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
