package com.care.root.admin.product.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.root.admin.product.dto.MessageDTO;
import com.care.root.admin.product.dto.productDTO;
import com.care.root.adminProduct.mtbatis.productMapper;


//상품등록서비스임플
@Service
public class productServiceImpl implements productService{
	@Autowired productMapper mapper;
	
	@Override
	public void adminProductList(Model model) {
		model.addAttribute("adminProductList",mapper.adminProductList());
		
	}

	@Override
	public String productSave(MultipartHttpServletRequest mul, HttpServletRequest request) {
		productDTO dto = new productDTO();
		
		dto.setProductTitle(mul.getParameter("productTitle"));
		dto.setProductName(mul.getParameter("productName"));
		//dto.setProductThumbnail(mul.getParameter("productThumbnail"));
		dto.setProductCategory(mul.getParameter("productCategory"));
		dto.setProductCompany(mul.getParameter("productCompany"));
		dto.setProductNum(mul.getParameter("productNum"));
		dto.setProductPee(mul.getParameter("productPee"));
		dto.setProductQuantity(mul.getParameter("productQuantity"));
		dto.setProductContent(mul.getParameter("productContent"));
		
		//dto.setProductPhoto1(mul.getParameter("productPhoto1"));
		
		productFileService pfs = new productFileServiceImpl();
		MultipartFile file = mul.getFile("productThumbnail");
		//MultipartFile file2 = mul.getFile("productPhoto1");
		if(file.getSize() != 0) { //이미지 등록한 경우
			dto.setProductThumbnail(pfs.saveFile(file));
			//dto.setProductPhoto1(pfs.saveFile(file2));
		}else {
			dto.setProductThumbnail("nan");
		}
		return pfs.getMessage(mapper.productSave(dto), request);
	}

	@Override
	public void adminProductView(String productNum,Model model) {
		model.addAttribute("productView",mapper.adminProductView(productNum));
		
	}

	@Override
	public String productModify(MultipartHttpServletRequest mul, HttpServletRequest request) {
		productDTO dto = new productDTO();
		dto.setProductTitle(mul.getParameter("productTitle"));
		dto.setProductName(mul.getParameter("productName"));
		dto.setProductCategory(mul.getParameter("productCategory"));
		dto.setProductCompany(mul.getParameter("productCompany"));
		dto.setProductNum(mul.getParameter("productNum"));
		dto.setProductPee(mul.getParameter("productPee"));
		dto.setProductQuantity(mul.getParameter("productQuantity"));
		dto.setProductContent(mul.getParameter("productContent"));
		
		
		
		MultipartFile file = mul.getFile("productThumbnail");//"imageFileName" 사용자로부터 넘어온 선택된 파일 또는 originFile
		productFileService pfs = new productFileServiceImpl();
		if(file.getSize() != 0) { // 이미지 변경됨
			dto.setProductThumbnail(pfs.saveFile(file)); // 이미지 파일을 수정하면 수정된 이미지 파일 이름으로 바꿈
			//pfs.deleteImage(mul.getParameter("originFileName"));
		}else {
			dto.setProductThumbnail(mul.getParameter("originFileName")); // 이미지 변경 안됨(기존에 파일을 선택햇으면 파일이름이, 안했으면 nan이 들어있음
		}
		//파일이 변경되지 않았다는 가정
		int result = mapper.productModify(dto);
		MessageDTO mDTO = new MessageDTO();
		mDTO.setResult(result); //result가 성공인지 실패인지를 가지고 있음
		mDTO.setRequest(request);
		mDTO.setSuccessMessage("성공적으로 수정되었습니다!");
		mDTO.setSuccessURL("/adminProduct/adminProductList");
		mDTO.setFailMessage("수정 중 문제가 발생햇습니다");
		mDTO.setFailURL("/adminProduct/adminProductView");
		String message = pfs.getMessage(mDTO);
		return message;
		
	}

	

//	@Override
//	public String productDelete(String productNum, String productThumbnail, HttpServletRequest request) {
//		System.out.println("서비스 상품코드 : " + productNum);
//		productFileService pfs = new productFileServiceImpl();
//		int result = mapper.delete(productNum); // result에는 제대로 삭제되면 1, 삭제가 안되면 1이 아닌 값
//		if(result == 1) {
//			pfs.deleteImage(productThumbnail);
//		}
//		
//		MessageDTO mDTO = new MessageDTO();
//		mDTO.setResult(result); //result가 성공인지 실패인지를 가지고 있음
//		mDTO.setRequest(request);
//		mDTO.setSuccessMessage("성공적으로 삭제되었습니다!");
//		mDTO.setSuccessURL("/board/boardAllList");
//		mDTO.setFailMessage("삭제 중 문제가 발생햇습니다");
//		mDTO.setFailURL("/board/contentView");
//		return pfs.getMessage(mDTO);
//		
//	}
	
	

	



	
 
}






























