package com.gkeeper.service;

import org.springframework.stereotype.Service;

import com.gkeeper.dto.UserDto;
import com.gkeeper.dto.UserLoginDto;
import com.gkeeper.entity.User;
import com.gkeeper.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public boolean login(UserLoginDto loginDto) {
		User findUser = userRepository.findByUserEmail(loginDto.getEmail()).get();
		
		if(findUser == null) {
			return false;	
		}
		if(!findUser.getUserpsw().equals(loginDto.getPassword())) {
			return false;
		}
		
		return true;
		
	}
	

	
	
	//회원가입
	public User signup(UserDto userDto) {
		if(userRepository. findByUserEmail(userDto.getUserEmail()).orElse(null) != null) {
			throw new RuntimeException("이미 가입되어 있는 이메일입니다.");
		}
		
		User user = User.builder()
				.userEmail(userDto.getUserEmail())
				.userpsw(userDto.getUserpsw())
				.nickname(userDto.getNickname())
				.userName(userDto.getUserName())
				.gender(userDto.getGender())
				.userYear(userDto.getUserYear())
				.userMonth(userDto.getUserMonth())
				.userDay(userDto.getUserDay())
				.userDate(userDto.getUserDate())
				.build();
		
		return userRepository.save(user);
	}
	

}
