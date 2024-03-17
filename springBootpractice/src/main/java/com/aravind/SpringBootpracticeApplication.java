package com.aravind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class SpringBootpracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootpracticeApplication.class, args);
       Home h =     context.getBean(Home.class);
	   h.display();
	   //here the spring container creates a singleton scope in which only one object is created.
		//In spring they don't say the object in spring container as object they say it as bean of spring.
		Home h2 =     context.getBean(Home.class);
		h2.display();
	}

}
