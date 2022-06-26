package com.favtuts.customer.dao;

import javax.inject.Named;

@Named
public class CustomerDAO 
{
	
	public void save() {
		System.out.println("CustomerDAO save method...");
	}	
}
