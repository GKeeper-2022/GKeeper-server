package com.gkeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gkeeper.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserPageController {
	
	@GetMapping("/login")
	public String openLoginPage() {
		return "user/login";
	}
	
	@GetMapping("/signup")
	public String openSingUpage() {
		return "user/signup";
	}

}
