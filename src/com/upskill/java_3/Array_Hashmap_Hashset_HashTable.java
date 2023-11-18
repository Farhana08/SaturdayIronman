package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
	
		int age = 30;						//Variable
		int[] ageIronMan = new int[]{25, 32 ,37,  21, 27}; //Array 
		//Array index   [0] [1] [2] [3] [4]                      //Array index start from zero
		
		System.out.println("Student Age :"  +ageIronMan[2]);
		System.out.println("Total Student :"  + ageIronMan.length);
   
		String[] cosmatics = {"Lips", "Eye", "Face", "Hair"};     //From YouTube this Array Method, little different
		System.out.println("Items Name:"  + cosmatics [0]);
		System.out.println("Total Items: "  + cosmatics.length);
	
       String[] nameIronMan = new String[]{"Farhana", "Kulsuma", "Shanta", "Jannatul", "Sumaia"};
       System.out.println("Student Name:"  +nameIronMan[2]);
        System.out.println("Total Student Name :"  + nameIronMan.length);

        //Multiple- Dimentional Array
    int [][] ageIronMan2D = {{25, 32, 37, 21, 27, 32},      //[0][0]  [0][1]  [0][2]  [0][3]  [0][4]  [0][4]
		{26, 30, 33, 28}};        					       //[1][2]  [1][1]  [1][2]  [1][3]

     System.out.println("Student Age 2D :"   +ageIronMan2D[1][3]);

      //HashMap store multiple data using key-value pair, 
     //(Key must be unique; value can be duplicate //Implementation of Map interface 
     
     HashMap<String, Integer> Student = new HashMap<String, Integer>();
     Student.put("Abdullah", 25);
     Student.put("Madan", 23);
     Student.put("Usuf", 24);
     Student.put("Jannatul", 21);
     Student.put("Jannatul", 22);
     System.out.println("HashMap Student Age :"  +Student.get("Jannatul"));
     System.out.println("HashMap Student Age :"  +Student.get("Usuf"));
     
     HashMap<String, String> Capital = new HashMap<String, String>();   //Practice HashMap
     Capital.put("Bangladesh", "Dhaka");
     Capital.put("USA", "Washington DC");
     Capital.put("India", "New Delhi");
     System.out.println("Capital City :"  +Capital.get("USA"));
     
     HashMap<Integer, String> Patients = new HashMap<Integer, String>();  //Practice HashMap
     Patients.put(100,"Mohammad Husain");
     Patients.put(101,"Kamal Sing");
     Patients.put(102,"Rahim Ahmed");
     Patients.put(103,"Kamal Khan");
     System.out.println("Patients Name:"  +Patients.get(103));
     
    
    //HashSet store unordered collection containing value (Unique data), Implementation of Set Interface

     HashSet<String> car = new HashSet<String>();
     
     car.add("BMW");
     car.add("Toyota");
     car.add("Tesla");
     car.add("Audi");
     System.out.println("Car : "  +car);
     
     
     //HashTable store multiple data using key-value pair, No duplicate
     //  also is synchronized (only one thread can be modified)
     Hashtable<String, String> Region = new Hashtable<String, String>();
     Region.put("BD", "Asia");
     Region.put("India", "Asia");
     Region.put("USA", "America");
     System.out.println("Region :  " + Region.get("USA") );
	}
	}



