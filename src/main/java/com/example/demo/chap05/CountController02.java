package com.example.demo.chap05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CountController02 {
	
	@Autowired
	private HttpSession session;
	//HttpSession session = request.getSession(true);
	
	@Autowired
	private Count c;


	@GetMapping("/index02")
	public String index() {
		session.invalidate();
		
		return "chap05/counter02";
	}
	
	@GetMapping("/countup02")
	public String countUp() {
		int num = c.getNum();
		num++;
		c.setNum(num);
		
		return "chap05/counter02";
	}
}
