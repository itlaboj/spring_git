package com.example.demo.chap04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RandomStringController {
	
	@Autowired
	private RandomStringService service;
	
	@GetMapping("/random")
	public String index() {
		return "chap04/random";
	}

	@PostMapping("/random")
	public String index(
			@RequestParam(name="CharLength") Integer charLength,
			@RequestParam(name="withNumber", defaultValue="false") boolean withNumber,
			Model m
			) {
		
		List<String> list = service.generate(charLength, withNumber);
		
		m.addAttribute("list", list);
		
		return "chap04/random";
	}

}
