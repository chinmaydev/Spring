package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class FirstAppController {

	
	public FirstAppController() {
		System.out.println("Controller Created");
	}
	
	@RequestMapping("/add")
	public void  add() {
		System.out.println("inside add");
	}

}
