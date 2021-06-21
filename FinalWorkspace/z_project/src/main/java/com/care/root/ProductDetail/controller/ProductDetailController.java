package com.care.root.ProductDetail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ProductDetail")
public class ProductDetailController {
	@RequestMapping("product")
	public String product() {
		
		return "ProductDetail/product";
	}
}
