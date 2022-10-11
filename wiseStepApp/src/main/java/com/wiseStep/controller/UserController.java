package com.wiseStep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiseStep.entity.Users;
import com.wiseStep.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// create user api // http://localhost:8080/api/user
		@PostMapping
		public ResponseEntity<Users> savePost(@RequestBody Users user) {
			
			return new ResponseEntity<Users>(userService.createUser(user), HttpStatus.CREATED);

		}
		
		//why not heppenig

}
