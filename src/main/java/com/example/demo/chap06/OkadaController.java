package com.example.demo.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OkadaController {
	
	@GetMapping("/step01")
	public String step01(Model m) {
		int result = 10 + 20;
		
		m.addAttribute("result", result);
		
		return "chap06/answer";
	}
	
	@GetMapping("/step02")
	public String step02(Model m) {
		int result = 10 / 0;
		
		m.addAttribute("result", result);
		
		return "chap06/answer";
	}
}
