package com.example.demo.chap07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DBController03 {
	//エンティティクラス「Item」に対応するリポジトリクラスの宣言
	@Autowired
	private ItemRepository itemRepository;
	
	//全レコードを表示する
	@GetMapping("/db21")
	public String db21(Model m) {
		
		List<Item> list = itemRepository.findAll();
		
		m.addAttribute("list", list);
		
		return "chap07/db21";
	}
	
//	
//	//単一検索（指定したコードでの検索）を表示する
//	@GetMapping("/db12")
//	public String db12(Model m) {
//		Category category = null;
//		
//		Optional<Category> record = categoryRepository.findById(1);
//		
//		if (record.isEmpty() == false) { //空っぽでなければ
//			category = record.get();
//		}
//		
//		m.addAttribute("category", category);
//		
//		return "chap07/db12";
//	}
//	
//	
//	//登録と変更
//	@GetMapping("/db13")
//	@Transactional
//	public String db13(Model m) {
//		//登録するエンティティクラスのインスタンスを生成
//		Category category = new Category("本");
//		
//		System.out.println(category.getCode()); //null
//		
//		//変更するエンティティクラスのインスタンスを生成
//		//Category category = new Category(4, "DVD");
//		
//		categoryRepository.save(category);
//		//customerRepository.saveAndFlush(customer);
//		
//		System.out.println(category.getCode()); //番号が表示
//		
//		//return "redirect:/db11";
//		return db11(m);
//	}
//	
//	
//	//削除
//	@GetMapping("/db14")
//	@Transactional
//	public String db14(Model m) {
//		categoryRepository.deleteById(5);
//		
//		//return "redirect:/db11";
//		return db11(m);
//	}
	
}
