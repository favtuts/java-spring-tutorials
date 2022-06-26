package com.favtuts.customer.services;

import javax.inject.Inject;
import javax.inject.Named;

import com.favtuts.customer.dao.CustomerDAO;

@Named
public class CustomerService 
{
	@Inject
	CustomerDAO customerDAO;

	public void save() {
		
		System.out.println("CustomerService save method...");
		customerDAO.save();
		
	}
		
}
