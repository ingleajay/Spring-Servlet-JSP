package com.constructor.ambiguity;

public class Addition {

	int a;
	int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Int parameter");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Double parameter");
	}
	public Addition(String a, String b) {
		super();
		this.a =Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String parameter");
	}
	
	public int add() {
		System.out.println("Value of a : " + this.a);
		System.out.println("Value of b : " + this.b);
		int sum = this.a + this.b;
		return sum;
	}
	
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
}
