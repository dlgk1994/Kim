package com.care.root.adminProduct.mtbatis;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.care.root.admin.product.dto.productDTO;
//상품등록 Mapper
public interface productMapper {
	public ArrayList<productDTO> adminProductList();
	public int productSave(productDTO dto);
	public productDTO adminProductView(String productNum);
	public int productModify(productDTO dto);
	//public int delete(String productNum);
	
}
