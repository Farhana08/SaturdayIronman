package com.upskill.assignment_2;

public class Assignment_2_9 {
	//Write a program to swap two string variables (Talen, Tech) and display result on the 

	public static void main(String[] args) {
		

		String name1 = "Talen";
		String name2 = "Tech";
		
		System.out.print("Befor swapping:");
		System.out.print(" name1 = "  + name1);
		System.out.println(", name2 =  "  +name2);
		
		String temp = "Talen";
		 name1 = name2;
		 name2 = "Talen";
		
		System.out.print("After swapping: ");
		System.out.print("name1 = "  + name1);
		System.out.print(", name2 = "  +name2);
		
		
		
	}

}
