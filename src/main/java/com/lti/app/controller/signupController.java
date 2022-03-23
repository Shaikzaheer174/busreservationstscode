package com.lti.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping; //added
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Login; //added
import com.lti.app.pojo.signup;
import com.lti.app.service.signupservice;


@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200")
public class signupController
{
	@Autowired
	signupservice sservice;
	
	
	@PostMapping("/signup")
	public boolean mysignup(@RequestBody signup signup)
	{
		return sservice.mysignup(signup);
	}
	
	
	@GetMapping("/validatelogin/{logid}/{passwd}") 
	public boolean validateLogin(@PathVariable("logid") String id,@PathVariable("passwd") String pass)
	{
			return sservice.validateLogin(id, pass);
	}
	
//	
	@GetMapping("/adminvalidatelogin/{logid}/{passwd}") 
	public boolean adminvalidateLogin(@PathVariable("logid") String id,@PathVariable("passwd") String pass)
	{
			return sservice.adminvalidateLogin(id, pass);
	}
	


}
