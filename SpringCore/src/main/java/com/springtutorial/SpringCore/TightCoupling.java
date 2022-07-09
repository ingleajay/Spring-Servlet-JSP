package com.springtutorial.SpringCore;

class Topic {
    public void understand()
    {
        System.out.println("topic is understanding...");
    }
} 

class Subject {
    Topic t = new Topic();
    public void startReading()
    {
        t.understand();
    }
}


// Tight coupling from example: 
// 1. subject class is fully depend on topic class

// 2. if we change topic class understand() to gotit() then we need to change in subject class also

// 3. subject class is tightly couple with topic class

// 4. Tight coupling does not provide the concept of interface.

// 5. In Tight coupling, it is not easy to swap the codes between two classes

public class TightCoupling {

	public static void main(String[] args) {
		
		Subject s = new Subject();
		s.startReading();

	}
}