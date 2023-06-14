package com.example.demo.chap07;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Items")
public class Item {
	//フィールド
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //SERIAL対応
	private Integer id; //ID
	
//	@Column(name="category_code")
//	private Integer categoryCode; //カテゴリ・コード
	
	@ManyToOne
	@JoinColumn(name="category_code", referencedColumnName="code")
	private Category category; //Categoryのエンティティクラス
	
	private String name; //商品名
	private Integer price; //単価
	
	public Item() {
		
	}
}
