package com.upskill.java_6;

public class MultithreadingThread extends Thread{

	public void run(){    /*create a new class that extends the Thread class and 
		override its run() method 
		to define the code that will be executed in the new thread.*/
		try{
			System.out.println("Thread Number # "  
			+ Thread.currentThread().getId()  + " is Running");
		} catch (Exception e){
			System.out.println("Exception is cought");
		e.printStackTrace();
		}
	}
}
