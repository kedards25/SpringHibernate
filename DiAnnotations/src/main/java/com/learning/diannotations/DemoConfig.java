package com.learning.diannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learning.diannotations")
public class DemoConfig {

	@Bean
	public DemoClass getObj()
	{
//		DemoClass demo=new DemoClass();
//		return demo;
		
		return new DemoClass();
	}
	
}
