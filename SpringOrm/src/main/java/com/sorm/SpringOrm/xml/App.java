package com.sorm.SpringOrm.xml;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sorm/SpringOrm/xml/config.xml");
        StudentDao  sd = context.getBean("studentdaoimp",StudentDao.class);
        Student s = context.getBean("student",Student.class);
        System.out.println("Welcome to spring hibernate ");
        System.out.println("Enter student details : ");
        System.out.println("Enter student id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        s.setSid(id);
        sc.nextLine();
        System.out.println("Enter student name");
        String name = sc.nextLine();
        s.setSname(name);
        System.out.println("Enter student branch");
        String branch = sc.next();
        s.setSbranch(branch);
        System.out.println(s);
       
        // insert data : 
//        int r = sd.insertdata(s);
//        if(r != 0) {
//        	System.out.println("Data inserted successfully");
//        }
        
        // update data
//        boolean res = sd.updatedata(s);
//        if(res == true) {
//        	System.out.println("Data updated successfully");
//        }
        
        // delete data
//      boolean res = sd.deletedata(s.getSid());
//      if(res == true) {
//      	System.out.println("Data deleted successfully");
//      }
        
        // get single object of student
        Student st = sd.getonestudata(s.getSid());
        System.out.println(st);
        
        // get multiple objects
        List<Student> slist = sd.getallstudata();
        for(Student sf : slist) {
        	System.out.println("Id : " + sf.getSid());
        	System.out.println("Name : " + sf.getSname());
        	System.out.println("Branch : " + sf.getSbranch());
        }
    }
}
