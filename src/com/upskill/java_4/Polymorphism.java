package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature/peramiter to overload
	- Method Overriding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
   public static void main(String[] args) {                 
		car(5, 100);
		Polymorphism obj = new Polymorphism();
	    obj.annualIncomeVoid();
   }
   
   //void method                                        //Method Overridding               
   public void annualIncomeVoid(){
	   int calculateAnnualIncome = hourlyIncome * 2000;
	   int bonus = 25000;
	   int rent = 15000;
	   int side = 10000;
	   int totalIncome = calculateAnnualIncome + bonus + rent + side;
	   System.out.println("My Annual Income = " + totalIncome);
	   
	   System.out.println("My Income = "  + calculateAnnualIncome);
   }
  
   
   public static void car(){                            // Method Overloading
	  System.out.println("My car is Tesla");
	   }

public static void car (String color){
	System.out.println("My car is Tesla It has color: "  +color);
}
public static void car (int door){
	System.out.println("My car is Tesla ! It has door: "   +door);

}
public static void car (int door, String color){
	System.out.println("My car is Tesla ! It has door: "   +door + " ,It has color" +color);
}
public static void car (boolean is1sCar){
	System.out.println("My car is my 1st car"  +is1sCar);
}
public static void car (int Seats,int MaximumSpeed){
	System.out.println("My car is Tesla ! It has seats: " + Seats + " , It has Speed MPH " + MaximumSpeed);
}
}


