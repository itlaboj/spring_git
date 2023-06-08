package com.example.demo.chap05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CountController {
	
	@Autowired
	private HttpSession session;
	//HttpSession session = request.getSession(true);


	@GetMapping("/index")
	public String index() {
		session.invalidate();
		
		return "chap05/counter";
	}
	
	@GetMapping("/countup")
	public String countUp() {
		Integer count = (Integer)session.getAttribute("COUNT");
		
		if (count == null) {
			count = 0;
		}
		
		count++;
		
		session.setAttribute("COUNT", count);
		
		return "chap05/counter";
	}
}
