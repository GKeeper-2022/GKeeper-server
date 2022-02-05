package com.gkeeper.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.httpBasic().disable()
//		.csrf().disable()
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and()
//		.headers()
//		.frameOptions()
//		.sameOrigin()
//		
//		.and()
//		.sessionManagement()
//		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		
//		.and()
//		.authorizeRequests() // 바로 다음 antMatchers에 해당하는 url은 인증된 유저만 가능함
//		.antMatchers("/couldnotimplement/**").authenticated() // 모든 인증 유저
//		.anyRequest().permitAll(); // 그 외에 모든 요청은 모든 접근을 허용
//	}
}
