package com.upskill.assignment_3;

	// Write a java program which will display 
	// 5 employee information(name, age, salary and address).

public class Assignment_3_2 {
	
	public static void main(String[] args) {
		
		 
		        String[] names = {"John", "Alice", "Bob", "Eva", "Mike"};
		        int[] ages = {30, 25, 28, 22, 35};
		        double[] salaries = {50000.0, 45000.0, 48000.0, 40000.0, 55000.0};
		        String[] addresses = {"123 Main St", "456 Elm St", "789 Oak St", "101 Pine St", "222 Cedar St"};

		        System.out.println("Employee Information:");
		        for (int i = 0; i < 5; i++) {
		            System.out.println("Employee " + (i + 1) + ":");
		            System.out.println("Name: " + names[i]);
		            System.out.println("Age: " + ages[i]);
		            System.out.println("Salary: $" + salaries[i]);
		            System.out.println("Address: " + addresses[i]);
		            System.out.println(); // Add a blank line for separation
		        }
		    }
		}		

