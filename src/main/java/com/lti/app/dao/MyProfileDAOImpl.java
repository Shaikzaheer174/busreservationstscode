package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.MyFeedback;
import com.lti.app.pojo.MyProfile;

@Repository
public class MyProfileDAOImpl implements MyProfileDAO {
	
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addProfile(MyProfile profile) {
		eMan.persist(profile);
		return true;
	}

	@Override
	public List<MyProfile> getProfile() {
		
		return eMan.createQuery("from MyProfile").getResultList();
	}

	@Override
	public boolean updateProfile(MyProfile profile) {
		// TODO Auto-generated method stub
		eMan.merge(profile);
		return true;
	}

	@Override
	public boolean addFeedback(MyFeedback feedback) {
		// TODO Auto-generated method stub
		eMan.persist(feedback);
		return true;
	}

	@Override
	public List<MyFeedback> getFeedback() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from MyFeedback").getResultList();
	}

	}
