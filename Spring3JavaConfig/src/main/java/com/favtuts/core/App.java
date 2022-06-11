package com.favtuts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.favtuts.config.AppConfig;
import com.favtuts.hello.HelloWorld;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHelloWorld("Spring3 Java Config");
    }
}
