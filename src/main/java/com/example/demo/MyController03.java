package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController03 {
	
	@PostMapping("/receive01")
	public String receive01(
			@RequestParam(name="NAME", defaultValue="名前なし") String name, //name属性値「NAME」の値を取得
			@RequestParam(name ="AGE", defaultValue="0") Integer age, //name属性値「AGE」の値を取得
			@RequestParam("GENDER") String gender, //name属性値「GENDER」の値を取得
			@RequestParam(name="FOOD", defaultValue="") String[] food, //name属性値「FOOD」の値を取得
			@RequestParam(name="CAL", defaultValue="") LocalDate cal, //name属性値「CAL」の値を取得
			Model m) {
		//フォワード先で表示するデータの設定
		m.addAttribute("name", name);
		m.addAttribute("age", age);
		m.addAttribute("gender", gender);
		m.addAttribute("food", food);
		//m.addAttribute("cal", cal);
		m.addAttribute("cal", cal.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
		
		return "receive01";
	}
	
	@GetMapping("/test07/{data}")
	public String test07(
			Model m,
			@PathVariable String data) {
		m.addAttribute("data", data);
		
		return "test07";
	}
}
