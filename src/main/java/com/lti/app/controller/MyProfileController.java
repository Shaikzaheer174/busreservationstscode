package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.MyFeedback;
import com.lti.app.pojo.MyProfile;
import com.lti.app.service.MyProfileService;

@RestController
@RequestMapping("rest/api/")
@CrossOrigin("http://localhost:4200")
public class MyProfileController {
	
	@Autowired
	MyProfileService pService;
	
	@GetMapping("/profile")
	public List<MyProfile> getProfile() {
		return pService.getProfile();
	}
	
	@PostMapping("/profile")
	public boolean addProfile(@RequestBody MyProfile profile) {
		return pService.addProfile(profile);
	}
	
	@PutMapping("/profile") //For Updating 
	public boolean updateProfile(@RequestBody MyProfile profile)
	{
		return pService.updateProfile(profile);
	}

//FEEDBACK	
	@GetMapping("/feedback")
	public List<MyFeedback> getFeedback() {
		return pService.getFeedback();
	}
	
	
	@PostMapping("/feedback")
	public boolean addFeedback(@RequestBody MyFeedback feedback) {
		return pService.addFeedback(feedback);
	}


}
