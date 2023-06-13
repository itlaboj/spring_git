package com.example.demo.chap07;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Customers")
public class Customer {
	//フィールド
	@Id
	@Column(name="code")
	private Integer code; //コード
	private String name; //名前
	private Integer age; //年齢
	
	public Customer() {
		
	}

	public Customer(Integer code, String name, Integer age) {
		this.code = code;
		this.name = name;
		this.age = age;
	}
}
