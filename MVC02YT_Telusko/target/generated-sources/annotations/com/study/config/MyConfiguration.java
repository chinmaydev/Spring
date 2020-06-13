package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.study")
public class MyConfiguration {

	public MyConfiguration() {
		System.out.println("Inside Config");
	}

	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		//resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	
}
