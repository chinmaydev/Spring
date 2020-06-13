package com.study;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	public AddController() {
		//Created during server run	
		System.out.println("Inside Constructor");	
	}

	@RequestMapping("/add")
	//public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		System.out.println("Inside Add");
		
		ModelAndView mv = new ModelAndView();
		// mv.setViewName("output.jsp");
		//.jsp is not required as viewresolver added
		mv.setViewName("output");

		//mv.addObject("result",Integer.parseInt(request.getParameter("t1"))+Integer.parseInt(request.getParameter("t2")));
		mv.addObject("result",i+j);
		return mv;
	}



}
