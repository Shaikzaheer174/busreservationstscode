package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logindetails")
public class Login {
	
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="logpass")
	private String passwd;
	@Column(name="role")
    private String role;	
	

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getLoginid() {
		return loginid;
	}


	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Login [loginid=" + loginid + ", passwd=" + passwd + ", role=" + role + "]";
	}



}
