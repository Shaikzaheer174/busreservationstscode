package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.MyProfileDAO;
import com.lti.app.pojo.MyFeedback;
import com.lti.app.pojo.MyProfile;

@Service
@Transactional
public class MyProfileServiceImpl implements MyProfileService{
	
	@Autowired
	MyProfileDAO pdao;
	//MyFeedback fdao;

	@Override
	public boolean addProfile(MyProfile profile) {
		
		return pdao.addProfile(profile);
	}

	@Override
	public List<MyProfile> getProfile() {
	
		return pdao.getProfile();
	}

	@Override
	public boolean updateProfile(MyProfile profile) {
		// TODO Auto-generated method stub
		return pdao.updateProfile(profile);
	}

	@Override
	public boolean addFeedback(MyFeedback feedback) {
		// TODO Auto-generated method stub
		
		return pdao.addFeedback(feedback);
	}

	@Override
	public List<MyFeedback> getFeedback() {
		// TODO Auto-generated method stub
		return pdao.getFeedback();
	}

	
	

}
