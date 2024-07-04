package com.alien;

//  What is shallow copy in java?

class Rectangle1 {
	int length = 5;
	int breadth = 3;
}

public class ShallowCopyExample {

	public static void main(String[] args) {

		Rectangle1 obj1 = new Rectangle1();

		Rectangle1 obj2 = obj1; // Shallow Copy

		System.out.println(" Before Changing the value of object 1, the object2 will be - ");
		System.out.println(" Object2 Length = " + obj2.length + ", Object2 Breadth = " + obj2.breadth);

		// Changing the values for object1.
		obj1.length = 10;
		obj1.breadth = 20;

		System.out.println("\n After Changing the value of object 1, the object2 will be - ");
		System.out.println(" Object2 Length = " + obj2.length + ", Object2 Breadth = " + obj2.breadth);

	}
}