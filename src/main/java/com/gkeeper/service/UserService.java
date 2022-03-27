package com.gkeeper.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gkeeper.dto.UserDto;
import com.gkeeper.dto.UserLoginDto;
import com.gkeeper.entity.User;
import com.gkeeper.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	// 이 메소드에서 수정한 객체를 실제 DB에도 반영하기 위해 사용하는 annotation
	@Transactional
	public boolean login(UserLoginDto loginDto) {
		Optional<User> findUser = userRepository.findByUserEmail(loginDto.getEmail());
		
		if(findUser.isEmpty()) {
			return false;	
		}
		if(!findUser.get().getUserpsw().equals(loginDto.getPassword())) {
			return false;
		}
		
		User thisUser = findUser.get();
		Timestamp now = Timestamp.valueOf(LocalDateTime.now());
		thisUser.setUserActiveDate(now);
		
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
