package com.favtuts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.favtuts.core.SchedulerBo;

@Configuration
public class SchedulerConfig {
    
    @Bean(name="scheduler")
    public SchedulerBo suchedulerBo(){
        
        return new SchedulerBo();
        
    }
    
}