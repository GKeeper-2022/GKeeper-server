package com.gkeeper.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gkeeper.dto.GoalDto;
import com.gkeeper.entity.Goal;
import com.gkeeper.repository.GoalRepository;
import com.gkeeper.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class GoalService {
	private final GoalRepository goalRepository;
	private final UserRepository userRepository;
	
	public Goal saveGoal(GoalDto goalDto) {
		
		Goal goal = Goal.builder()
				.goalId(goalDto.getGoalId())
				.userId(goalDto.getUserId())
				.nickname(goalDto.getNickname())
				.goalTitle(goalDto.getGoalTitle())
				.goalContent(goalDto.getGoalContent())
				.goalStart(goalDto.getGoalStart())
				.goalEnd(goalDto.getGoalEnd())
				.goalStatus(goalDto.getGoalStatus())
				.goalMax(goalDto.getGoalMax())
				.goalPeriod(goalDto.getGoalPeriod())
				.goalCheckTime(goalDto.getGoalCheckTime())
				.goalAssignPublic(goalDto.getGoalAssignPublic())
				.build();		
		
		return goalRepository.save(goal);
	}
	
	// 목표 리스트 조회
	
	public Page<Goal> findAll(Pageable pageable){
		int page = (pageable.getPageNumber() == 0) ? 0: (pageable.getPageNumber() -1);
		pageable = PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC,"GoalId"));
		return goalRepository.findAll(pageable);
		
	}

}
