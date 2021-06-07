package com.care.root.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String notice(Model model, 
			@RequestParam(value="num", required=false, defaultValue="1") int num) {
		//bs.selectBoardList(model, num); //paging : num 추가
		return "board/notice";
	}
	//Q&A
	@RequestMapping("qna")
	public String qna() {
		return "board/qna";
	}
	
}
