package com.upskill.assignment_2;

public class Assignment_2_7 {
	/*You are given two integer number (a=25, b=30), write a program to swap them and 
    display result on the screen. */

	public static void main(String[] args) {
		
	int a = 25;
	int b = 30;
	
	System.out.println("Before swapping:");
	System.out.println("a= "  +a);
	System.out.println("b= " +b);
	
	int temp= a;
	a=b;
	b= temp;
	
	System.out.println("After swapping:");
	System.out.println("a= "  +a);
	System.out.println("b= " +b);
	
	}
}

