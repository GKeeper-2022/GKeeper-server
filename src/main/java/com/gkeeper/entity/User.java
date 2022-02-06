package com.gkeeper.entity;

import java.sql.Timestamp;

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
@Table(name="user")
@Getter
@Setter
@Builder
@AllArgsConstructor

public class User {

	@Id
	@Column(name="userId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="nickname")
	private String nickname;
	
	@Column(name="userEmail", unique=true)
	private String userEmail;
	
	@Column(name="userPassword")
	private String userpsw;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="userYear")
	private Integer userYear;
	
	@Column(name="userMonth")
	private Integer userMonth;
	
	@Column(name="userDay")
	private Integer userDay;
	
	@Column(name="userDate", nullable=false, updatable=false, insertable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp userDate;
	
	@Column(name="userActiveDate")
	private Timestamp userActiveDate;
	
	@Column(name="activated", columnDefinition="BOOLEAN DEFAULT 1")
	private boolean activated;
	
}
