package com.upskill.assignment_3;

public class Assignment_3_5 {

	public static void main(String[] args) {
		// Dingdong program : Write a Java program that prints the numbers from 1 to 50. 
		// But for multiples of three prints "Ding" instead of the number and for the multiples of five prints "Dong".
		//For numbers which are multiples of both three and five print "Dingdong"


	

for (int i = 1; i <= 50; i++) {
    // Check if the number is a multiple of both 3 and 5
    if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("Dingdong");
    }
    // Check if the number is a multiple of 3
    else if (i % 3 == 0) {
        System.out.println("Ding");
    }
    // Check if the number is a multiple of 5
    else if (i % 5 == 0) {
        System.out.println("Dong");
    }
    // If none of the above conditions are met, simply print the number
    else {
        System.out.println(i);
    }
}
}
}




