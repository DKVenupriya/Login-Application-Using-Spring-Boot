package com.jsp.LoginApplication.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.LoginApplication.DAO.UserDao;
import com.jsp.LoginApplication.DTO.User;

@RestController
public class UserController {
	
	@Autowired
	UserDao dao;
	
	@PostMapping("/insert")
	public String registerUser(@RequestBody User u)
	{
		 return dao.addUser(u);
		
	}
	
	@GetMapping("/verify")
	public String verifyingUser(@RequestParam String username,@RequestParam String password)
	{
		return dao.loginValidation(username, password);
			
	}
	

}
