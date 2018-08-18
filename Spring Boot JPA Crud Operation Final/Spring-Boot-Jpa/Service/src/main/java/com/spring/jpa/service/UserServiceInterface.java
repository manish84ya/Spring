package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import com.spring.jpa.model.User;

public interface UserServiceInterface 
{
	public String addUser(User user);
	public List<User> findAll();
	public void deleteById(Integer id);
	public Optional<User> findById(Integer id);
	public void update(User user);
	

}
