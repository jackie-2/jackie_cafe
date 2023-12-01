package com.jackie_cafe.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String page1() throws Exception {
		return "/login";
	}
	
	@RequestMapping(value="/loginFailure")
	public String page2() throws Exception {
		return "/loginFailure";
	}
	
	@RequestMapping(value="/access_denied_page")
	public String page3() throws Exception {
		return "/access_denied_page";
	}

}
