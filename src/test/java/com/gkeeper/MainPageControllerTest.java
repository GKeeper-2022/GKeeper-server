package com.gkeeper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.gkeeper.controller.MainPageController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainPageController.class)
public class MainPageControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void openIndexTest() throws Exception {
		
		String checker = "!DOCTYPE html";
		String content = "목표가 진행 중";
		
		mvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString(checker)))
		.andExpect(content().string(containsString(content)))
		.andDo(print());
		
	}
}
