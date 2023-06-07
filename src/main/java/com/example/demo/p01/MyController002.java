package com.example.demo.p01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController002 {

	@GetMapping("/test002")
	public String test002() {
		return "山田太郎";
	}
}
