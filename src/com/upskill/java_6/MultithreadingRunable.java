package com.upskill.java_6;

public class MultithreadingRunable implements Runnable{
	public void run(){  //Another way to create a thread is by implementing the Runnable interface.
		try{
			System.out.println("Thread Number # "  
			+ Thread.currentThread().getId()  + " is Running");
		} catch (Exception e){
			System.out.println("Exception is cought");
		e.printStackTrace();
		}
	}
}

