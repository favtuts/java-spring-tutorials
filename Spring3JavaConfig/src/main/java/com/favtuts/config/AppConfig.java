package com.favtuts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.favtuts.hello.HelloWorld;
import com.favtuts.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
    
    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
