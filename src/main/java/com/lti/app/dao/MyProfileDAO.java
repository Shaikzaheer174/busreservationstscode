package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.MyFeedback;
import com.lti.app.pojo.MyProfile;


public interface MyProfileDAO {
	
	public boolean addProfile(MyProfile profile);
	public List<MyProfile> getProfile();
	public boolean updateProfile(MyProfile profile);
	
	public boolean addFeedback(MyFeedback feedback);
	public List<MyFeedback> getFeedback();


}
