package com.prasanna.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.prasanna.code")
@PropertySource(value = { "classpath:collegeInfo.properties" })
public class CollageConfig {

/*	
	@Bean
	public Teacher teacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean({"abc", "xyz"})
	public Collage collageBean() {
		Collage collage = new Collage();
		collage.setPrincipal(principalBean());
		collage.setTeacher(teacherBean());
		return collage;
	}
*/
}
