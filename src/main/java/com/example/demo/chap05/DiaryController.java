package com.example.demo.chap05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class DiaryController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private User u;

	@Autowired
	private DiaryList diaryList;

	@GetMapping("/diary")
	public String index() {
		session.invalidate();
		
		return "chap05/login";
	}
	
	@PostMapping("/login")
	public String login(
			@RequestParam("NAME") String name,
			Model m
			) {
		
		if (name.equals("山田太郎") == false) {
			//ログイン失敗
			session.invalidate();
			
			return "chap05/login";
		}
		
		//ログイン成功
		u.setName(name);
		
		return "chap05/diary";
	}
	
	@PostMapping("/regist")
	public String regist(
			@RequestParam("TITLE") String title,
			@RequestParam("CONTENT") String content,
			Model m
			) {
		
		//Diaryのインスタンスを生成
		Diary diary = new Diary(title, content);
		
		diaryList.addDiary(diary);
		
		return "chap05/diary";
	}
	
	@GetMapping("/test")
	public String test() {
		return "chap05/test";
	}
}
