package com.kosta.dao;

import java.sql.Date;

public class MemberDTO {
	private int mno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date signdate;
	
	public MemberDTO(int mno, String id, String pwd, String name, String email, Date signdate) {
		super();
		this.mno = mno;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.signdate = signdate;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getSigndate() {
		return signdate;
	}

	public void setSigndate(Date signdate) {
		this.signdate = signdate;
	}
	
	
}
