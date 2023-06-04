package com.example.demo.p02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController02 {

	@GetMapping("/test02")
	public String test02() {
		return "test02";
	}

	@GetMapping("/test03")
	public String test03() {
		return "p02/test03";
	}
}
