package com.example.demo.p01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController01 {

	@GetMapping("/test01")
	public String test01() {
		return "山田太郎";
	}
}
