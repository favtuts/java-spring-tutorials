package com.favtuts.customer.dao;

import com.favtuts.customer.model.Customer;

public interface CustomerDAO {
    public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
