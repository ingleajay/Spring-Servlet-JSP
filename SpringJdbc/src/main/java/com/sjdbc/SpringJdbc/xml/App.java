package com.sjdbc.SpringJdbc.xml;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sjdbc/SpringJdbc/xml/config.xml");
        StudentDao studentdao = context.getBean("studentdao",StudentDao.class);
        Student s = context.getBean("stu",Student.class);
        System.out.println("Welcome to spring jdbc ");
        System.out.println("Enter student details : ");
        System.out.println("Enter student id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        s.setSid(id);
        sc.nextLine();
        System.out.println("Enter student name");
        String name = sc.nextLine();
        s.setSname(name);
        System.out.println("Enter student city");
        String city = sc.next();
        s.setScity(city);
        System.out.println(s);
        
         //insert data
//        int res = studentdao.insert(s);
//        if(res != 0) {
//        	System.out.println("Insert successfully");
//        }
        
        
        //update data 
//      int res = studentdao.change(s);
//      if(res != 0) {
//      	System.out.println("update successfully");
//      }
        
        // delete data
//        int res = studentdao.delete(s.getSid());
//        if(res != 0) {
//       	System.out.println("delete successfully");
//        }
        
        // get one student data
        Student student = studentdao.getstudent(s.getSid());
        System.out.println("Name : " + student.getSname());
        System.out.println("City : " + student.getScity());
        
        // all student obejct
        List<Student> students = studentdao.getallstudent();
        for(Student s1 : students) {
        	System.out.println(s1);
        }
        
    }
}
