package com.upskill.assignment_2;

public class Assignment_2_5 {
	//Write  a program in Java to display the multiplication table of (eight)8.
	
	public static void main(String[] args) {
		
		multiplicationTable();
		
	   }

	private static void multiplicationTable() {
		
		int num1 = 8;
			for(int num2 = 1; num2 <=10; num2++){
				int multiplicationTable = num1*num2;
				System.out.println(multiplicationTable + "  ");
		}
		
	}
	}
		





//int number = 8;
//System.out.println("Multiplication Table for 8");
//for( int i=1; i<=10; i++){
//	int result = number*i;
//
//System.out.println(number + "*" +i+ "=" + result);
//	



