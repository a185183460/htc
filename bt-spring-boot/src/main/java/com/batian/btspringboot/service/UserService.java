package com.batian.btspringboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.batian.btspringboot.model.User;
import com.batian.btspringboot.mysql55.mapper.UserMapper55;
 
public interface UserService {
	
	List<User> getAll();
	
	
    Map<String,Object> getUser();
	

 
}