package com.gkeeper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig {
	
	// http://localhost:8080/swagger-ui/   로 접속
	
	@Bean   
    public Docket api() {
        return new Docket(DocumentationType.OAS_30) 
          .select()                                 
          .apis(RequestHandlerSelectors.any())             
          .paths(PathSelectors.any())                         
          .build();                                          
    }
}
