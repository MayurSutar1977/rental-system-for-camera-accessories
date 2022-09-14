package com.app.rsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.rsys.dto.ResponseDTO;
import com.app.rsys.interfaces.IUserService;
import com.app.rsys.pojos.model.User;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private IUserService userService;

	public UserController() {
		System.out.println("user Controller invoked");
	}

	@GetMapping("/get-all-users")
	public List<User> display() {
		return userService.getAllUser();
	}
	@GetMapping("/get-all-users-2")
	public ResponseEntity<?> getAllUser() {
		try {
			return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		//return userservice.getAllUser();
	}
@PostMapping("/create-new-user")
	public ResponseEntity<?> createNewUser(@RequestBody User newUser) {
	System.out.println(newUser);
		return new ResponseEntity<>(userService.createNewUser(newUser), HttpStatus.OK);

	}

	@GetMapping("/get-all-users-3")
	public ResponseDTO<?> getAllUser3() {
		try {
			return new ResponseDTO<>(userService.getAllUser(), HttpStatus.OK,"users loaded successfully");
			
		}catch(Exception e) {
			return new ResponseDTO<>(null, HttpStatus.BAD_REQUEST,"Failed to load data");
		}
		//return userservice.getAllUser();
	}
	
}
