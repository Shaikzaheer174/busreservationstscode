package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.app.dao.signupDAO;

import com.lti.app.pojo.signup;

@Service
@Transactional
public class signupserviceimpl implements signupservice
{
	@Autowired
	signupDAO sdao;

	@Override
	public boolean mysignup(signup signup) 
	{
		// TODO Auto-generated method stub
		return sdao.mysignup(signup);
	}

	@Override
	public boolean validateLogin(String logid, String pass)
	{
		// TODO Auto-generated method stub
		return sdao.validateLogin(logid, pass);
	}
//

	@Override
	public boolean adminvalidateLogin(String logid, String pass) {
		// TODO Auto-generated method stub
		return sdao.adminvalidateLogin(logid, pass);
	}
	
	
	

}
