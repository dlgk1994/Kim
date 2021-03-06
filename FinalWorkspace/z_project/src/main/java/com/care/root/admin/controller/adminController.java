package com.care.root.admin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.care.root.admin.product.dto.productDTO;
import com.care.root.admin.product.service.productFileService;
import com.care.root.admin.product.service.productService;

@Controller //관리자 컨트롤러
public class adminController {
	@Autowired 
	productService ps;
	
	//관리자 상품 리스트
	@GetMapping("adminProduct/adminProductList")
	public String adminProductList(Model model) {
		ps.adminProductList(model);
		return "adminProduct/adminProductList";
	}
	
	// 상품 등록
	@RequestMapping("adminProduct/adminProductInput")
	public String adminProductInput() {
		return "adminProduct/adminProductInput";
	}
	//상품저장
	@PostMapping("adminProduct/productSave")
	public void productSave(MultipartHttpServletRequest mul,//<-서비스로 넘겨줌->서비스에서 값 꺼내와서 mapper로 넘겨줌 ->db에 저장
							  HttpServletResponse response,
							  HttpServletRequest request) throws Exception {
		
		String message = ps.productSave(mul, request);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.print(message);
	}
	//상품 내용 확인
	@RequestMapping("adminProduct/adminProductView")
	public String adminProductView(@RequestParam String productNum,Model model) {
		ps.adminProductView(productNum,model);
		return "adminProduct/adminProductView";
	}
	@GetMapping("adminProduct/download")
	public void download(@RequestParam String productThumbnail,
						 HttpServletResponse  response) throws Exception {
		// addHeader : 사용자에게 전달할 값이 다운로드할 값인지 데이터를 보내줄껀지를 위해
		response.addHeader("Content-disposition", "attachment;imageFileName="+productThumbnail);
		// disposition : 해당 내용을 웹브라우저에 inline방식으로 데이터를 추가할지,
		// 해당하는 이미지("attachment;imageFileName="+imageFileName)를 보내줄껀지 결정
		
		File file = new File(productFileService.IMAGE_REPO+"/"+productThumbnail); // 업로드 할때 만든 경로. 해당 경로에서 파일을 가져오겠다
		FileInputStream in = new FileInputStream(file);// 해당하는 경로부터 파일을 읽어 오겠다
		FileCopyUtils.copy(in, response.getOutputStream()); // 읽어온값 response 에게 넘겨주기
		in.close();
		
	}

	
	
	//상품수정(업데이트)
	@PostMapping("adminProduct/adminProductModify")
	public void adminProductModify(MultipartHttpServletRequest mul,
									HttpServletResponse response, // 사용자에게 메시지 전달(성공,실패)
									HttpServletRequest request) throws Exception {
		String message = ps.productModify(mul,request);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.print(message);
	}
	
	
	
	
	
	
	
	//관리자 전체 회원 조회
	@RequestMapping("adminMember/adminMemberList")
	public String adminMemberList() {
		return "adminMember/adminMemberList";
	}
	
	
	//관리자 회원 상세정보
	@RequestMapping("adminMember/adminMemberInfo")
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
	
	
	//FAQ 등록
	@RequestMapping("boardInput/faqInput")
	public String faqInput() {
		return "boardInput/faqInput";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
