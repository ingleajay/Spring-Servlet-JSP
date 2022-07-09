package com.springtutorial.SpringCore.Injection.reference.constructor;

public class Exam {

	String ename;
	Book book;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(String ename, Book book) {
		super();
		this.ename = ename;
		this.book = book;
	}

	@Override
	public String toString() {
		return "ename=" + ename + ", book=" + book ;
	}

}
