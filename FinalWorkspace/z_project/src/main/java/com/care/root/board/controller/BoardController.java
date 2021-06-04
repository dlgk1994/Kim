package com.care.root.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {
	
	//자주하는 질문 
	@RequestMapping("faq")
	public String faq() {
		return "board/faq";
	}
	//공지사항
	@RequestMapping("notice")
	public String notice() {
		return "board/notice";
	}
	//Q&A
	@RequestMapping("qna")
	public String qna() {
		return "board/qna";
	}
	
}
