package com.care.root.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
	
	//관리자 상품 리스트
	@RequestMapping("adminProductList")
	public String adminProductList() {
		return "adminProduct/adminProductList";
	}
	// 상품 등록
	@RequestMapping("adminProductInput")
	public String adminProductInput() {
		return "adminProduct/adminProductInput";
	}
	//상품 수정
	@RequestMapping("adminProductModify")
	public String adminProductModify() {
		return "adminProduct/adminProductModify";
	}
	//관리자 전체 회원 조회
	@RequestMapping("adminMemberList")
	public String adminMemberList() {
		return "adminMember/adminMemberList";
	}
	
	
	//관리자 회원 상세정보
	@RequestMapping("adminMemberInfo")
	public String adminMemberInfo() {
		return "adminMember/adminMemberInfo";
	}
	
	//QnA작성
	@RequestMapping("boardInput/qnaInput")
	public String qnaInput() {
		return "boardInput/qnaInput";
	}
	
	//공지사항 작성
	@RequestMapping("boardInput/noticeInput")
	public String noticeInput() {
		return "boardInput/noticeInput";
	}
	//공지사항 클릭하고 보기
	@RequestMapping("boardInput/notice")
	public String notice() {
		return "boardInput/notice";
	}
	//QnA 클릭해서 확인
	@RequestMapping("boardInput/QNA")
	public String QNA() {
		return "boardInput/QNA";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
