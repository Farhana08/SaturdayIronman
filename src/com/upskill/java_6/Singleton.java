package com.upskill.java_6;

public class Singleton {// Singleton is class that can have only one object
	
/* Private constructor, it prevents any other class from instantiating;
so that outer classes can not create object to your singletone*/
private Singleton(){
}

// Private static object of the class
private static Singleton SingletoneObj = new Singleton();

/*providing public static method getinsance() which will be
return only instant of the class*/
public static Singleton getInstance(){
	return SingletoneObj;
}		
protected static void demo1(){
   System.out.println("Demo I method for singletone calss");
}
protected static void demo2(){
	   System.out.println("Demo II method for singletone calss");
}   
protected static void demo3(){
		   System.out.println("Demo III method for singletone calss");
		   
		}
//Changes for Git Pull request practice
protected static void demo4(){
	   System.out.println("Demo IV method for singletone calss");
	   

}


