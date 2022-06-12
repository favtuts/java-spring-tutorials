package com.favtuts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.favtuts.core.CustomerBo;

@Configuration
public class CustomerConfig {
    
    @Bean(name="customer")
    public CustomerBo customerBo(){
        
        return new CustomerBo();
        
    }
}