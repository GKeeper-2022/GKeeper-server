package com.gkeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.ApiOperation;

@Controller
public class MainPageController {
	
	@GetMapping("")
	@ApiOperation(value = "메인 페이지 열기", notes = "메인 페이지를 여는 메소드")
	public String openIndexPage() {
		return "index";
	}
}
