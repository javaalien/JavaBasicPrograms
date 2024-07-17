package com.alien;

// Polymorphism with Method Overloading

public class MethodOverloading {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print("Hello, World!"); // Output: Hello, World!
		printer.print(123); // Output: 123
		printer.print(3.14); // Output: 3.14
	}
}

class Printer {
	public void print(String message) {
		System.out.println(message);
	}

	public void print(int number) {
		System.out.println(number);
	}

	public void print(double number) {
		System.out.println(number);
	}
}