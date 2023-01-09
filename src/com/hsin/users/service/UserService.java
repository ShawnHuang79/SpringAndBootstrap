package com.hsin.users.service;

import java.util.List;

import com.hsin.users.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
}