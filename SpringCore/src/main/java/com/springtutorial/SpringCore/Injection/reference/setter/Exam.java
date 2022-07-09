package com.springtutorial.SpringCore.Injection.reference.setter;

public class Exam {

	String ename;
	Book book;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Exam [ename=" + ename + ", book=" + book + "]";
	}

}
