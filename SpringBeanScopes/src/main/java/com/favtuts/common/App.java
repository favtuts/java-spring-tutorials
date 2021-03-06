package com.favtuts.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.favtuts.customer.services.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
        /* ApplicationContext context = 
            new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"}); */
        
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});

        CustomerService custA = (CustomerService)context.getBean("customerService");
        custA.setMessage("Message by custA");
        System.out.println("Message : " + custA.getMessage());
        
        //retrieve it again
        CustomerService custB = (CustomerService)context.getBean("customerService");
        System.out.println("Message : " + custB.getMessage());
    }
}