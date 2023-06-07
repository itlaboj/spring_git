package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/id")
public class MyController02 {
	@GetMapping({"/test02", "/test03"})
	public String test02() {
		return "test02";
	}
	
	@GetMapping("/test04")
	public String test04() {
		return "test04";
	}
	
	@GetMapping("/test05")
	public String test05(Model m) {
		//m.setAttribute("NAME", "山田太郎");的な
		m.addAttribute("NAME", "山田太郎");
		m.addAttribute("AGE", 23);
		
		return "test05";
	}
	
	@GetMapping("/test06")
	public ModelAndView test06(ModelAndView mv) {
		//m.setAttribute("NAME", "山田太郎");的な
		mv.addObject("NAME", "佐藤次郎");
		mv.addObject("AGE", 24);
		
		//フォワード先のURLを設定
		mv.setViewName("test06");
		
		return mv;
	}
}
