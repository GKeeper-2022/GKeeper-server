package com.gkeeper.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gkeeper.entity.User;

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
public class UserDto {
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer userId;
	
	private String userName;
	
	private String nickname;
	
	private String userEmail;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String userpsw;// 회원가입 시에만 사용함. 그 외에는 외부로 유출되지 않음
	
	private String gender;
	
	private Integer userYear;
	
	private Integer userMonth;
	
	private Integer userDay;
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp userDate;
	
	// Response로 User Entity를 가져오는 경우
	public UserDto(User entity) {
		this.userId = entity.getUserId();
		this.userName = entity.getUserName();
		this.nickname = entity.getNickname();
		this.gender = entity.getGender();
		this.userYear = entity.getUserYear();
		this.userMonth = entity.getUserMonth();
		this.userDay = entity.getUserDay();
		this.userDate = entity.getUserDate();
	}
	
	

}
