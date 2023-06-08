package com.example.demo.chap05;

import lombok.Data;

@Data
public class Diary {
	//フィールド
	private String title;
	private String content;
	
	//コンストラクタ
	public Diary() {
		
	}

	public Diary(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
