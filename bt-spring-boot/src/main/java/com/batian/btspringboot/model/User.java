package com.batian.btspringboot.model;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
 
	private String id;
	
	private String username;
	
	private int age;
 
	public User() {
		super();
	}
 
	public User(String id, String name, int age) {
		super();
		this.id = id;
		this.username = name;
		this.age = age;
	}
 
	public String getId() {
		return id;
	}
 
	public void setId(String id) {
		this.id = id;
	}
 
	
 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
	
	
 
}
