
package com.lti.app.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.app.pojo.Login;
import com.lti.app.pojo.signup;


@Repository
public class signupDAOImpl implements signupDAO
{
	@Autowired
	EntityManager eMan;
	
	
	@Override
	public boolean mysignup(signup signup) 
	{
		eMan.persist(signup);
		Login obj=new Login();
		obj.setLoginid(signup.getEmail());
		obj.setPasswd(signup.getPassword());
		obj.setRole("user");
		eMan.persist(obj);
		return true;
	}


	@Override
	public boolean validateLogin(String logid, String pass) 
	{
		Query qry2=eMan.createQuery("from Login log where log.loginid =?1 and log.passwd=?2 and log.role='user'" );
		qry2.setParameter(1,logid);
		qry2.setParameter(2, pass);		
		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
					return true;
			else
					return false;
		
	}
// 
	
	@Override
	public boolean adminvalidateLogin(String logid, String pass) 
	{
		Query qry2=eMan.createQuery("from Login log where log.loginid =?1 and log.passwd=?2 and log.role='admin'" );
		qry2.setParameter(1,logid);
		qry2.setParameter(2, pass);		
		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
					return true;
			else
					return false;
		
	}
	
	
	
	
	


}
