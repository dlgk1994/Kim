package com.care.root.admin.product.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

//상품등록 서비스인터페이스
public interface productService {
	public void adminProductList(Model model);
	public String productSave(MultipartHttpServletRequest mul,HttpServletRequest request);
	public void adminProductView(String productNum,Model model);
	public String productModify(MultipartHttpServletRequest mul, HttpServletRequest request);
	//public String productDelete(String productNum, String productThumbnail,HttpServletRequest request);
	
}
