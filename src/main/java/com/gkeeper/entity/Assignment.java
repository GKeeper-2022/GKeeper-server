package com.gkeeper.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="assignment")
@Getter
@Setter
@AllArgsConstructor

public class Assignment {

	@Id
	@Column(name="assignId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer assignId;
	
	@Column(name="assignTitle",nullable = false)
	private String assignTitle;
	
	@Column(name="assignContent",nullable = false)
	private String assignContent;
	
	@Column(name="assignView")
	private Integer assignView;
	
	@Column(name="assignDate", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP") //�ۼ��Ͻ�
	private Timestamp assignDate;
	
	@Column(name="assignResult")
	private String assignResult;
	
	@Column(name="assignResultDate") //과제 검토 일시
	private Date assignResultDate;
	
	//목표, 회원 아이디

	
	
}
