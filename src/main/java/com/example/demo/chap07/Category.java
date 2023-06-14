package com.example.demo.chap07;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Categories")
public class Category {
	//フィールド
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //SERIAL対応
	private Integer code; //コード
	private String name; //名前
	
	public Category() {
		
	}

	public Category(String name) { //登録用
		this.name = name;
	}
	
	public Category(Integer code, String name) { //変更用
		this.code = code;
		this.name = name;
	}
}
