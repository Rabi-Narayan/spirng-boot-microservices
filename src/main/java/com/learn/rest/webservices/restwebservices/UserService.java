package com.learn.rest.webservices.restwebservices;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping(path = "/getAllUsers")
	public ResponseEntity<Object> saveUser(@RequestBody User user)
	{
		dao.saveUser(user);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).build();
		 
	}
}
