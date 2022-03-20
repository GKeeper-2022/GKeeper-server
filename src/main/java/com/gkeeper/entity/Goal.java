package com.gkeeper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="goal")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class Goal {

	@Id
	@Column(name="goalId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer goalId;
	
	
	@Column(name="goalTitle")
	private String goalTitle;
	
	@Column(name="goalContent")
	private String goalContent;
	
	@Column(name="goalStart") //목표 시작 일시
	private String goalStart; 
	
	@Column(name="goalEnd") //목표 마감 일시
	private String goalEnd; 
	
	@Column(name="goalStatus")
	private String goalStatus; // 목표 상태
	
	@Column(name="goalMax")
	private Integer goalMax; //목표 최대 인원
	
	@Column(name="goalPeriod")
	private String goalPeriod; //성과 확인 주기
	
	@Column(name="goalCheckTime") // 성과 확인 시간
	private String goalCheckTime;
	
	@Column(name="goalAssignPublic")
	private boolean goalAssignPublic; // 과제 공개 여부
	
	
	
	private Integer userId; //목표 운영자 아이디
	private String nickname; //목표 운영자 닉네임

	
	
//	@Builder
//	public Goal(int goalId, String nickname, String userEmail,String goalTitle, String goalContent, String goalStart, String goalEnd, String goalStatus,
//			int goalMax, String goalPeriod, String goalCheckTime, boolean goalAssignPublic) {
//		this.goalId = goalId;
//		this.nickname = nickname;
//		this.userEmail = userEmail;
//		this.goalTitle = goalTitle;
//		this.goalContent = goalContent;
//		this.goalStart = goalStart;
//		this.goalEnd = goalEnd;
//		this.goalStatus = goalStatus;
//		this.goalMax = goalMax;
//		this.goalPeriod = goalPeriod;
//		this.goalCheckTime = goalCheckTime;
//		this.goalAssignPublic = goalAssignPublic;	
//	}
	
	
	
	
	
}
