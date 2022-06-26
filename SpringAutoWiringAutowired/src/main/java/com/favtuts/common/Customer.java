package com.favtuts.common;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer 
{
	// you want autowired this field
	// @Autowired field
	// @Autowired
	// To disable Dependency checking by setting the required attribute
	@Autowired(required=false)
	private Person person;
		
	private int type;
	private String action;
	
	/*
	//@Autowired construtor
    @Autowired
    public Customer(Person person) {
        this.person = person;
    }
	*/
    
    //getter and setter methods
    
	public Person getPerson() {
		return person;
	}
	
	//@Autowired setter method
	//@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}	
}