package com.gkeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/goal")
public class GoalPageController {
	
	@GetMapping("")
	@ApiOperation(value = "전체 진행 목표 페이지 열기", notes = "전체 진행 목표 페이지를 여는 메소드")
	public String openPresentGoalListPage() {
		return "goalList";
	}
	
	@GetMapping("/theme/{theme}")
	@ApiOperation(value = "주제별 진행 목표 페이지 열기", notes = "특정 주제의 진행 목표 페이지를 여는 메소드")
	public String openPresentGoalByThemePage(@PathVariable String theme, Model model) {
		//model.addAttribute("theme", theme);
		return "goalList";
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value = "개별 목표 페이지 열기", notes = "개별 목표 페이지를 여는 메소드")
	public String openGoalPage(@PathVariable final Long id, Model model) {
		//model.addAttribute("gid", id);
		return "goalDetail";
	}
	
	@GetMapping("/{id}/signup")
	@ApiOperation(value = "개별 목표 가입 페이지 열기", notes = "개별 목표 가입 페이지를 여는 메소드")
	public String openGoalSignUpPage(@PathVariable final Long id, Model model) {
		//model.addAttribute("gid", id);
		return "goalSignUp";
	}
	
	// PreAuthorize
	@GetMapping("/{id}/signup/list")
	@ApiOperation(value = "개별 목표 가입 신청자 목록 페이지 열기", notes = "개별 목표 가입 신청자 목록 페이지를 여는 메소드")
	public String openGoalSignUpListPage(@PathVariable final Long id, Model model) {
		//model.addAttribute("gid", id);
		return "goalSignUpList";
	}
	
	@GetMapping("/{id}/assign/list")
	@ApiOperation(value = "개별 목표 성과물 리스트 페이지 열기", notes = "개별 목표 성과물 리스트 페이지를 여는 메소드")
	public String openGoalSubmitListPage(@PathVariable final Long id, Model model) {
		//model.addAttribute("gid", id);
		return "assignList";
	}
	
	@GetMapping("/{id}/assign/write")
	@ApiOperation(value = "개별 목표 성과물 제출 페이지 열기", notes = "개별 목표 성과물 제출 페이지를 여는 메소드")
	public String openGoalSubmitWritePage(@PathVariable final Long id, Model model) {
		//model.addAttribute("gid", id);
		return "assignWrite";
	}
	
	@GetMapping("/{gid}/assign/{aid}")
	@ApiOperation(value = "개별 목표 성과물 조회하기", notes = "개별 목표 성과물 제출 내용을 조회하는 메소드")
	public String openGoalSubmitWritePage(@PathVariable final Long gid, @PathVariable final Long aid, Model model) {
		//model.addAttribute("gid", gid);
		//model.addAttribute("aid", aid);
		return "assignWrite";
	}
	
	@GetMapping("/{id}/detail")
	@ApiOperation(value = "개별 목표 상세 정보 페이지 열기", notes = "개별 목표 상세 정보 페이지를 여는 메소드")
	public String openGoalSubmitPage(@PathVariable final Long id, Model model) {
		//model.addAttribute("gid", id);
		return "goal";
	}
}
