package com.nissan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nissan.model.bookData;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
    public bookData prototypeBean() {
        return new bookData();
    }

}
