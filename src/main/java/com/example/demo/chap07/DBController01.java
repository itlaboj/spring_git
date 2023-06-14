package com.example.demo.chap07;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.transaction.Transactional;

@Controller
public class DBController01 {
	//エンティティクラス「Customer」に対応するリポジトリクラスの宣言
	@Autowired
	private CustomerRepository customerRepository;
	
	//全レコードを表示する
	@GetMapping("/db01")
	public String db01(Model m) {
		
		//List<Customer> list = customerRepository.findAll();
		//List<Customer> list = customerRepository.findByAgeGreaterThan(23);
		List<Customer> list = customerRepository.findByAgeGreaterThanEqual(23);
		
		m.addAttribute("list", list);
		
		return "chap07/db01";
	}
	
	//単一検索（指定したコードでの検索）を表示する
	@GetMapping("/db02")
	public String db02(Model m) {
		Customer customer = null;
		
		//Optional<Customer> record = customerRepository.findById(21);
		Optional<Customer> record = customerRepository.findByCode(1);
		
		if (record.isEmpty() == false) { //空っぽでなければ
			customer = record.get();
		}
		
		m.addAttribute("customer", customer);
		
		return "chap07/db02";
	}
	
	//登録と変更
	@GetMapping("/db03")
	@Transactional
	public String db03(Model m) {
		//登録・変更するエンティティクラスのインスタンスを生成
		Customer customer = new Customer(4, "山本四郎", 32);
		
		customerRepository.save(customer);
		//customerRepository.saveAndFlush(customer);
		
		//return "redirect:/db01";
		return db01(m);
	}
	
	//登録と変更
	@GetMapping("/db04")
	@Transactional
	public String db04(Model m) {
		customerRepository.deleteById(4);
		
		//return "redirect:/db01";
		return db01(m);
	}
	
}
