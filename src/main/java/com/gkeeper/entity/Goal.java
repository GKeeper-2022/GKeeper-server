package com.gkeeper.entity;

import java.sql.Date;
import java.sql.Time;

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
	private String gaolContent;
	
	@Column(name="goalStart") //목표 시작 날짜
	private Date goalStart; 
	
	@Column(name="goalEnd") //목표 만료 날짜
	private Date goalEnd; 
	
	@Column(name="goalStatus")
	private String goalStatus;
	
	@Column(name="goalMax")
	private Integer goalMax;
	
	@Column(name="goalPeriod")
	private String goalPeriod;
	
	@Column(name="goalCheckTime") //Time으로 하는게 좋을지 String으로 하는게 좋을지,,
	private Time goalCheckTime;
	
	@Column(name="goalAssignPublic")
	private boolean goalAssignPublic;
	
	private Integer userId; //운영자 아이디
	
	
	
}
