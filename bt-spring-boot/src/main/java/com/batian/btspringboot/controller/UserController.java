package com.batian.btspringboot.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batian.btspringboot.model.User;
import com.batian.btspringboot.mysql55.mapper.UserMapper55;
import com.batian.btspringboot.service.UserService;
import com.batian.btspringboot.service.impl.UserServiceImpl;
 
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getAll")
    public List<User> getAll(){
		return userService.getAll();
    }
	
	
	@RequestMapping("/getUser")
    public Map<String,Object> getUser(){
		return userService.getUser();
    }

	
	
	
	

	
 
}