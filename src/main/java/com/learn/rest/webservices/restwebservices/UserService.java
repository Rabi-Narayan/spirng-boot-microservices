package com.learn.rest.webservices.restwebservices;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.rest.webservices.bean.User;

@RestController
public class UserService {

	@Autowired
	UserDAO dao;
	
	@GetMapping(path = "/getAllUsers")
	public ArrayList<User> getUsers()
	{
		return dao.getAllUser();
	}
	
	@GetMapping(path = "/getAllUsers/{id}")
	public User getUser(@PathVariable int id)
	{
		return dao.getUser(id);
	}
}
