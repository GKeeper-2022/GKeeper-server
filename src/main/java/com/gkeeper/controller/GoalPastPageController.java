package com.gkeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/goal/past")
public class GoalPastPageController {
	
	@GetMapping("")
	@ApiOperation(value = "전체 종료 목표 페이지 열기", notes = "전체 종료 목표 페이지를 여는 메소드")
	public String openPastGoalListPage() {
		return "goalList";
	}
	
	@GetMapping("/theme/{theme}")
	@ApiOperation(value = "주제별 종료 목표 페이지 열기", notes = "특정 주제의 종료 목표 페이지를 여는 메소드")
	public String openPastGoalByThemePage(@PathVariable String theme, Model model) {
		//model.addAttribute("theme", theme);
		return "goalList";
	}
}
