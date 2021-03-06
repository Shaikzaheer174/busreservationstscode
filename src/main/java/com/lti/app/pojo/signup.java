package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class signup 
{
	@Column(name="firstName")
	private String fname;
	@Column(name="lastName")
	private String lname;
	@Id
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="confirmPassword")
	private String confirmpassword;
	@Column(name="mobileNo")
	private String mobileno;
	
	public signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public signup(String fname, String lname, String email, String password, String confirmpassword, String mobileno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "signup [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", mobileno=" + mobileno + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
}
