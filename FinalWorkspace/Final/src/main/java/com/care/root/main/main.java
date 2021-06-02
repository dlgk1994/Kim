package com.care.root.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class main {
	
	@RequestMapping("main")
	public String header() {
		return "default/main";
	}
}
