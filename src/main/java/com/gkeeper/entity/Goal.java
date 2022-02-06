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
	
	@Column(name="goalStart") //��ǥ ���� ��¥
	private Date goalStart; 
	
	@Column(name="goalEnd") //��ǥ ���� ��¥
	private Date goalEnd; 
	
	@Column(name="goalStatus")
	private String goalStatus;
	
	@Column(name="goalMax")
	private Integer goalMax;
	
	@Column(name="goalPeriod")
	private String goalPeriod;
	
	@Column(name="goalCheckTime") //Time���� �ϴ°� ������ String���� �ϴ°� ������,,
	private Time goalCheckTime;
	
	@Column(name="goalAssignPublic")
	private boolean goalAssignPublic;
	
	private Integer userId; //��� ���̵�
	
	
	
}
