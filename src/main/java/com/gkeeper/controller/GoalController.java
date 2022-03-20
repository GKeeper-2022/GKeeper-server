package com.gkeeper.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gkeeper.dto.GoalDto;
import com.gkeeper.entity.Goal;
import com.gkeeper.service.GoalService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Api(value = " GoalController")
public class GoalController {
	
	private final GoalService goalService;
	
	
	// goal 등록 
	@PostMapping("/goals")
	@ApiOperation(value="목표 작성",notes="목표를 작성하는 API. Goal entity클래스로 데이터 저장")
	public ResponseEntity<Goal> saveGoal(@Valid @RequestBody GoalDto goalDto ) {	
		
		return ResponseEntity.ok(goalService.saveGoal(goalDto));
	}
	
	
//	@GetMapping("/goals")
//	@ApiOperation(value="목표전체조회",notes="목표를 조회하는 API.")
//	public GoalDto<Goal> boardList(){
//		return Goal
//	}
}
