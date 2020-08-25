package com.in28minutes.rest.webservices.restfulwebservices.Query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserHardCodedService {

	private static List<User> users=new ArrayList();
	static {
		users.add(new User("shubham","Shubham","Dalal","dummy","dshubh2015@gmail.com"));
		users.add(new User("shruti","Shruti","Shrivastava","dummy","kuchfarzisa@gmail.com"));
		users.add(new User("sameer","Sameer","Gangrade","dummy","sabsefarzi@gmail.com"));
		
	}
	
	public User findUser(String username,String password) {
		for(User u:users) {
			if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
				return u;
			}
			
		}
		return null;
	}
}
