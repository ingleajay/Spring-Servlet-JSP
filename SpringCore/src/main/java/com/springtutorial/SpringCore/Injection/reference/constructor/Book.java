package com.springtutorial.SpringCore.Injection.reference.constructor;

public class Book {

	int bid;
	String bname;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "bid=" + bid + ", bname=" + bname;
	}
}
