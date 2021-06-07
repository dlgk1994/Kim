package com.care.root.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.mypage.service.MypageService;

@Controller
@RequestMapping("mypage")
public class MypageController {
	@Autowired MypageService ms;
	
	//장바구니
	@RequestMapping("myCart")
	public String myCart(Model model, 
			@RequestParam(value="num", required=false, defaultValue="1") int num) {
		ms.myCart(model, num); //리스트 -> model에 저장
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
