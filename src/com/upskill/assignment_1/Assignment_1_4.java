package com.upskill.assignment_1;

public class Assignment_1_4 {

	public static void main(String[] args) {
		// A function returns 30, another function returns 50. 
		//Write a java program which will display subtraction value from bigger number to smaller.
		

		        int num1 = getNumber1();
		        int num2 = getNumber2();

		        int biggerNumber = Math.max(num1, num2);
		        int smallerNumber = Math.min(num1, num2);

		        int subtractionValue = biggerNumber - smallerNumber;

		        System.out.println("Bigger number: " + biggerNumber);
		        System.out.println("Smaller number: " + smallerNumber);
		        System.out.println("Subtraction value: " + subtractionValue);
		    }

		    public static int getNumber1() {
		        return 30;
		    }

		    public static int getNumber2() {
		        return 50;
		    }
		


	}


