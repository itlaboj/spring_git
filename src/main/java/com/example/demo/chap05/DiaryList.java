package com.example.demo.chap05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@SessionScope
@Component
@Data
public class DiaryList {
	//フィールド
	private List<Diary> list = new ArrayList<>(); //日記を収納
	
	//日記追加メソッド
	public void addDiary(Diary diary) {
		list.add(diary);
	}
}
