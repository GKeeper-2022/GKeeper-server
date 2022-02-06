package com.gkeeper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="MainController")
public class MainController {
	
	@GetMapping("")
	@ApiOperation(value = "Swagger API 작동 여부 확인", notes = "REST Controller 작동 확인 API")
	public String returnIndex() {
		return "index api";
	}
}
