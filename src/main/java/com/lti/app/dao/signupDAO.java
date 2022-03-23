package com.lti.app.dao;

import com.lti.app.pojo.signup;

public interface signupDAO
{
	
	public boolean mysignup(signup signup);
	public boolean validateLogin(String logid,String pass);
	
//	
	public boolean adminvalidateLogin(String logid,String pass);

}
