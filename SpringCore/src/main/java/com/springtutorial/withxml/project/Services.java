package com.springtutorial.withxml.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Services {
	static Scanner sc = new Scanner(System.in);
	public static int sid;
	public static String sname;
	public static Student storestudent() {
		Student s = new Student();
		System.out.println("Enter Student Details : ");
		System.out.println("Enter Student Id");
		sid = sc.nextInt();
		System.out.println("Enter Student Name");
		sc.nextLine();
		sname = sc.nextLine();
		s.setSid(sid);
		s.setSname(sname);
		return s;
	}
//	
	public static List<Subject> addsubject(){
		ArrayList<Subject> a = new ArrayList<Subject>();
		System.out.println("Enter number of subject  : ");
		int no = sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter Subject Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Subejct Name : ");
			String subname = sc.nextLine();
			Subject sb = new Subject(id,subname);
			a.add(sb);
		}
		return a;
	}
	
	public static Address addAddress() {
		Address a = new Address();
		System.out.println("Enter Address details : ");
		System.out.println("Enter City : ");
		String city = sc.nextLine();
		System.out.println("Enter Country : ");
		String country = sc.nextLine();
		System.out.println("Enter Zip : ");
		int zip = sc.nextInt();
		a.setCity(city);
		a.setCountry(country);
		a.setZip(zip);
		return a;
	}
}
