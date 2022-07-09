package com.model;

public class Search {

	int seid;
	String sename;
	String sengine;
	int sid;
	
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Search(int seid, String sename, String sengine, int sid) {
		super();
		this.seid = seid;
		this.sename = sename;
		this.sengine = sengine;
		this.sid = sid;
	}

	public int getSeid() {
		return seid;
	}

	public void setSeid(int seid) {
		this.seid = seid;
	}

	public String getSename() {
		return sename;
	}

	public void setSename(String sename) {
		this.sename = sename;
	}

	public String getSengine() {
		return sengine;
	}

	public void setSengine(String sengine) {
		this.sengine = sengine;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Search [seid=" + seid + ", sename=" + sename + ", sengine=" + sengine + ", sid=" + sid + "]";
	}

	
	
}
