package com.upskill.assignment_2;

public class Assignment_2_8 {
	// Write Java Program to display Factorial of Number 7.


	public static void main(String[] args) {
		int number =7;
		long factorial = 1;
		
		for (int i = 1; i <= number; i++ ){
			factorial *=i;
		}
			
			System.out.println("Factorial of " +number + " is " +factorial);
		}

	

	}


