package com.alien;

public class MethodOverriding {

	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.makeSound(); // Output: Dog barks
		myCat.makeSound(); // Output: Cat meows
	}
}

class Animal {

	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}