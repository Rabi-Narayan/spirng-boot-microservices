package com.learn.rest.webservices.restwebservices;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.learn.rest.webservices.bean.User;

@Component
public class UserDAO {
	
	static ArrayList<User> arrayList = null;
	
	static int counter = 3;
	static {
		arrayList = new ArrayList<>();
		arrayList.add(new User("Rabi", 1, new Date()));
		arrayList.add(new User("Deepak", 2, new Date()));
		arrayList.add(new User("Sibani", 3, new Date()));
	}
	
	public ArrayList<User> getAllUser()
	{
		return arrayList;
	}
	
	public User getUser(int id)
	{
		for (int i = 0; i < arrayList.size() ; i++)
		{
			if(arrayList.get(i).getId() == id)
				return arrayList.get(i);
		}
		return null;
	}
	
	public User saveUser(User user)
	{
		user.setId(++counter);
		arrayList.add(user);
		return user;
	}
}
