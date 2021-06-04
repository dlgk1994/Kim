package com.care.root.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mypage")
public class MypageController {
	
	//장바구니
	@RequestMapping("myCart")
	public String myCart() {
		return "mypage/myCart";
	}
	//주문 내역
	@RequestMapping("myRental")
	public String myRental() {
		return "mypage/myRental";
	}
	//내 리뷰
	@RequestMapping("myReview")
	public String myReview() {
		return "mypage/myReview";
	}
	//리뷰작성페이지
	@RequestMapping("reviewForm")
	public String reviewForm() {
		return "mypage/reviewForm";
	}
	//내 질문 
	@RequestMapping("myEnquiry")
	public String myEnquiry() {
		return "mypage/myEnquiry";
	}
}
