package com.upskill.java_1;

public class Variables {
	
	// Variables in java
	
	
	 
	public String country = "USA";                 //Instance OR global variable - Variable declared in class level, outside method
	
	public static String region = "North America"; //Static variable - variables belong to class and dont't required creating object

    public static void main(String[] args) {
		 String city = "New York";
		 String police = "NYPD";
		 System.out.println(city);
		 System.out.println(region);
		 nj("Essex");
		 pa("Bensalem");
		 Variables obj = new Variables();
		 System.out.println(obj.country);
		 }
	
	public static void nj(String county){
		String city = "Bloomfield";     //Local variable - variable - variables declared in methods
		String police = "BPD";          //Method parameter - variables used as method parameter/ Variable outside to inside
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
       }
	
	public static void pa(String county){
		String city = "philli";
		String police = "PPD";
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
	  }

}
