package com.model;


public class Student {

	int sid;
	String sname;
	String scity;
	String szip;
	String semail;
	String scountry;
	String sbranch;
	long sphone;
	String simg;
	String password;
	
	
	public Student(int sid, String sname, String scity, String szip, String semail, String scountry, String sbranch,
			long sphone,String simg, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.szip = szip;
		this.semail = semail;
		this.scountry = scountry;
		this.sbranch = sbranch;
		this.sphone = sphone;
		this.simg = simg;
		this.password = password;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String sname, String scity, String szip, String semail, String scountry, String sbranch,
			long sphone, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.szip = szip;
		this.semail = semail;
		this.scountry = scountry;
		this.sbranch = sbranch;
		this.sphone = sphone;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSzip() {
		return szip;
	}
	public void setSzip(String szip) {
		this.szip = szip;
	}
	public String getScountry() {
		return scountry;
	}
	public void setScountry(String scountry) {
		this.scountry = scountry;
	}
	public long getSphone() {
		return sphone;
	}
	public void setSphone(long sphone) {
		this.sphone = sphone;
	}
	public String getSimg() {
		return simg;
	}
	public void setSimg(String simg) {
		this.simg = simg;
	}
	public String getSbranch() {
		return sbranch;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", szip=" + szip + ", semail=" + semail
				+ ", scountry=" + scountry + ", sbranch=" + sbranch + ", sphone=" + sphone + ", simg=" + simg
				+ ", password=" + password + "]";
	}
}
