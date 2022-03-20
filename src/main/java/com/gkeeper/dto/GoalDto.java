package com.gkeeper.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gkeeper.entity.Goal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoalDto {
	
	private Integer userId;
	private String nickname;
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer goalId;
	
	@NotBlank(message = "목표의 제목을 기입해주세요.")
	private String goalTitle;
	
	@NotBlank(message = "목표의 내용을 기입해주세요.")
	private String goalContent;
	
	@NotBlank(message = "목표의 시작일을 기입해주세요.")
	private String goalStart;
	
	@NotBlank(message = "목표의 마감일을 기입해주세요.")
	private String goalEnd;
	
	private String goalStatus;
	
	@NotNull(message = "목표의 참여인원을 기입해주세요.")
	private Integer goalMax;
	
	@NotBlank(message = "목표의 성과 확인 주기를 기입해주세요.")
	private String goalPeriod;
	
	@NotBlank(message = "목표의 성과 확인시간을 기입해주세요.")
	private String goalCheckTime;
	
	@NotNull(message = "목표의 성과공개여부를 선택해주세요.")
	private boolean goalAssignPublic;
	
	// Request로 Goal Entity저장하는 경우
//	public Goal toEntity() {
//		return Goal.builder()
//				.goalID(goalId)
//				.nickname(nickname)
//				.userEmail(userEmail)
//				.goalTitle(goalTitle)
//				.goalContent(goalContent)
//				.goalStart(goalStart)
//				.goalEnd(goalEnd)
//				.goalStatus(goalStatus)
//				.goalMax(goalMax)
//				.goalPeriod(goalPeriod)
//				.goalCheckTime(goalCheckTime)
//				.goalAssignPublic(goalAssignPublic)
//				.build();			
//	}

	
	
	
	// Response로 Goal Entity를 가져오는 경우
	public GoalDto(Goal entity) {
		this.goalId = entity.getGoalId();
		this.goalTitle = entity.getGoalTitle();
		this.goalContent = entity.getGoalContent();
		this.goalStart = entity.getGoalStart();
		this.goalEnd = entity.getGoalStart();
		this.goalStatus = entity.getGoalStatus();
		this.goalMax = entity.getGoalMax();
		this.goalPeriod = entity.getGoalPeriod();
		this.goalCheckTime = entity.getGoalCheckTime();
		
	}




	public boolean getGoalAssignPublic() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
