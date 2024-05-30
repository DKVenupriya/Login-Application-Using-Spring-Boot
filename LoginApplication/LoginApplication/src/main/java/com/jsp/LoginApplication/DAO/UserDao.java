package com.jsp.LoginApplication.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.LoginApplication.DTO.User;
import com.jsp.LoginApplication.REPOSITORY.UserRepository;

@Repository
public class UserDao {
	
	@Autowired
	UserRepository repository;
	
	
	//........Inserting User Details..................
	
	public String addUser(User u)
	{
		repository.save(u);
		
		return "... User Registered Successfully...";
		
		
	}
	
	
	//..........Validating User for Login................
	
	public String loginValidation(String username, String password)
	{
		User u = repository.validateUser(username, password);
		
		if(u != null)
		{
			return "...Login Successfull...";
		}
		else
		{
			return "...Incorrect Username or Password...";
		}
		
		
	}
	
	

}
