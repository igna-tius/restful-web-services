package com.in28minutes.rest.webservices.restfulwebservices.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserResource {
	
	@Autowired
	private UserHardCodedService userService;
	
	@PostMapping("/login")
	public ResponseEntity<User>  updateQuery(@RequestBody Userobject user){
		
		User u=userService.findUser(user.getUsername(),user.getPassword());
		if(u!=null) {
			return new ResponseEntity<User>(u,HttpStatus.OK);
		}
		return new ResponseEntity<User>(u,HttpStatus.NOT_FOUND);
	}

}
