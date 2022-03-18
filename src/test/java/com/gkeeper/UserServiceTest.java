package com.gkeeper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.gkeeper.dto.UserDto;
import com.gkeeper.dto.UserLoginDto;
import com.gkeeper.entity.User;
import com.gkeeper.repository.UserRepository;
import com.gkeeper.service.UserService;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
	
	private UserRepository userRepository = Mockito.mock(UserRepository.class);
	private UserService userService;
	
	@BeforeEach
	public void setUp() {		
		userService = new UserService(userRepository);
	}
	
	@Test
	public void signupTest() {
		UserDto userDto = UserDto.builder()
				.userEmail("test@test.com")
				.userpsw("test")
				.userName("테스트")
				.build();
		
		when(userRepository.save(Mockito.any(User.class))).thenAnswer(i -> i.getArguments()[0]);
		User user = userService.signup(userDto);
		
		assertThat(user.getUserName()).isEqualTo("테스트");
		assertThat(user.getUserEmail()).contains("test@");
		
	}
	
	@Test
	public void loginTest() {		
		
		User user = User.builder()
				.userEmail("test@test.com")
				.userpsw("test")
				.userName("테스트")
				.build();
		
		Optional<User> op = Optional.of(user);
		
		when(userRepository.findByUserEmail(user.getUserEmail())).thenReturn(op);		
		
		// 올바른 로그인
		UserLoginDto loginDto = UserLoginDto.builder()
				.email("test@test.com")
				.password("test")
				.build();
		
		boolean result = userService.login(loginDto);
		
		// 아이디 틀림
		loginDto = UserLoginDto.builder()
				.email("test1@test.com")
				.password("test")
				.build();
		
		result = userService.login(loginDto);
		assertThat(!result);
		
		// 비밀번호 틀림
		loginDto = UserLoginDto.builder()
				.email("test@test.com")
				.password("testtest")
				.build();
		
		result = userService.login(loginDto);
		assertThat(!result);
		
	}
	
}
