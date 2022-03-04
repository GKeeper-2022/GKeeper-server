package com.gkeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserPageController {
	
	@GetMapping("")
	@ApiOperation(value = "회원별 페이지", notes ="회원 마이페이지")
	public String openUserPage() {
		return "userPage";
	}
	
	@GetMapping("/login")
	@ApiOperation(value = "로그인")
	public String openLoginPage() {
		return "login";
	}
	
	@GetMapping("/signup")
	@ApiOperation(value = "회원가입")
	public String openSingUpage() {
		return "signup";
	}

}
