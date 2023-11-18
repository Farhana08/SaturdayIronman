package com.upskill.java_4;

public class Constructor {
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String StudentName;
	int StudentAge;
	
	public Constructor(String name){
		StudentName = name;
	}
	public Constructor( int age){
		StudentAge = age;
	}
	
	public Constructor(String name, int age){
		StudentName = name;
		StudentAge = age;
	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor("Foyez");
		System.out.println(obj.StudentName);
		
		Constructor obj2 = new Constructor(30);
		System.out.println(obj2.StudentAge);
		
		Constructor obj3 = new Constructor("Amama" , 25);
		System.out.println(obj3.StudentName);
		System.out.println(obj3.StudentAge);
	 
	}

}
