package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController04 {
	
	@GetMapping("/test08")
	public String test08(Model m) {
		Human h = new Human("山田太郎", 23);
		
		m.addAttribute("h", h);
		
		return "test08";
	}
	
	@GetMapping("/test09")
	public String test09(Model m) {
		List<Item> list = new ArrayList<>();
		
		list.add(new Item("りんご", 200));
		list.add(new Item("みかん", 300));
		list.add(new Item("いちご", 400));
		
		m.addAttribute("list", list);
		
		return "test09";
	}
}
