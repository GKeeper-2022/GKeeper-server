package com.gkeeper.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gkeeper.dto.UserDto;
import com.gkeeper.dto.UserLoginDto;
import com.gkeeper.entity.User;
import com.gkeeper.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //AllArgsConstructor
@RestController
@RequestMapping("/api")
@Api(value="UserController", description ="사용자 관련 API")
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/login")
	public boolean login(@RequestBody UserLoginDto loginDto){
		return userService.login(loginDto);
		
	}
	
	
	
	
	@PostMapping("/signup")
	public ResponseEntity<User> signup(@RequestBody UserDto userDto) {
		return ResponseEntity.ok(userService.signup(userDto));
	}

//	
//	
//	@RequestMapping(value="",method=RequestMethod.POST)
//	@ApiOperation(value = "사용자 정보 등록", notes = "사용자 정보를 저장하는 API. User entity 클래스로 데이터를 저장한다.")
//    public ResponseEntity<ApiResponseMessage> insertUser( User user ){
//        ApiResponseMessage message = new ApiResponseMessage("Success", "등록되었습니다.", "", "");
//        ResponseEntity<ApiResponseMessage> response = new ResponseEntity<ApiResponseMessage>(message, HttpStatus.OK);
//         
//        return response;
//    }

}
