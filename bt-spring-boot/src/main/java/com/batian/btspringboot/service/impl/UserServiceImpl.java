package com.batian.btspringboot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.batian.btspringboot.model.User;
import com.batian.btspringboot.mysql55.mapper.UserMapper55;
import com.batian.btspringboot.oracle113.mapper.UserMapper113;
import com.batian.btspringboot.service.UserService;
 
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper55 userMapper;
	
	@Autowired
	private UserMapper113 userMapper113;

	@Override
	public List<User> getAll() {
		return userMapper.getAll();
	}

	@Override
	public Map<String, Object> getUser() {
		return userMapper113.getUser();
	}

	

 
}
