package com.upskill.java_1;

public class AccessModifier {
	
	public String name = "Farhana"; // public - Any class can access
	private int  age  = 35;     // private - Only same class can access
	
	protected int ssn = 512655; // protected - classes in the same package and subclass can access
					
	String address = "Shelmire Ave"; // default - classes in same package can access

}
