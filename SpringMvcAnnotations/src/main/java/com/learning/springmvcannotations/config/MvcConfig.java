package com.learning.springmvcannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.learning.springmvcannotations")
//helps to import mvc config from pre-defined package
@EnableWebMvc
public class MvcConfig {
	
	//It states that method is going to return the object of any class
	@Bean
	public InternalResourceViewResolver getResolverObj()
	{
		//It is useful for configuring views for all 
		//the requests,here we are configuring that 
		//all the views would be located in '/views/' folder
		//and would have extension as .jsp
		InternalResourceViewResolver resolver=
				new InternalResourceViewResolver();
		resolver.setPrefix("/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
