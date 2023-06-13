package com.example.demo.chap07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DBController01 {
	//エンティティクラス「Customer」に対応するリポジトリクラスの宣言
	@Autowired
	private CustomerRepository customerRepository;
	
	//全レコードを表示する
	@GetMapping("/db01")
	public String db01(Model m) {
		
		List<Customer> list = customerRepository.findAll();
		
		m.addAttribute("list", list);
		
		return "chap07/db01";
	}
	
}
