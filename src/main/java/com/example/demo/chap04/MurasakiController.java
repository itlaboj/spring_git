package com.example.demo.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MurasakiController {
	
	@Autowired
	private Okada o;
	
	@PostMapping("/add")
	public String add(
			@RequestParam("NUM1") Integer num1,
			@RequestParam("NUM2") Integer num2,
			Model m
			) {
		//Okada o = new Okada();
		
		int result = o.tasu(num1, num2);
		
		m.addAttribute("result", result);
		
		return "chap04/arai";
	}

}
