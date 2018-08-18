package com.spring.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.model.User;


public interface UserRepository extends CrudRepository<User, Integer>
{
	List<User> findByEmailAndPassword(String email,String password);

}
