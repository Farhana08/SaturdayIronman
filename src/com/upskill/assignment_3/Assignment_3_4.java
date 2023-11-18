package com.upskill.assignment_3;

public class Assignment_3_4 {

	 // Write a java program that explains runtime polymorphism.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

   public static void main(String[] args) {
        Animal myPet;

        // Create a Dog object
        myPet = new Dog();
        myPet.makeSound(); // Calls the Dog's makeSound method

        // Create a Cat object
        myPet = new Cat();
        myPet.makeSound(); // Calls the Cat's makeSound method
    }
}
