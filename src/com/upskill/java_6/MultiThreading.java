package com.upskill.java_6;
/* Multithreading is a java feature that allows concurrent execution of two or more parts of a program.
 *  
 *  Threads can be created by using two mechanisms
 *  
 *  	1. Extending the Thread class
  	    2. Implementing the Runnable Interface 
  	    
  	optional-     What are the 2 ways of multithreading in Java?
  	    
   In Java, multithreading a thread can be created by two ways:
1.By extending the thread class.
2.By implementing a Runnable interface*/

public class MultiThreading {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i< n; i++){
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
		Thread obj2 = new Thread(new MultithreadingRunable());
		obj2.start();
		}

	}

}
