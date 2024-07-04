package com.alien;

//What is Deep copy in java?

class Rectangle2 {
	int length = 5;
	int breadth = 3;
}

public class DeepCopyExample {

	public static void main(String[] args) {

		Rectangle2 obj1 = new Rectangle2();
		// Shallow Copy
		Rectangle2 obj2 = new Rectangle2();
		obj2.length = obj1.length;
		obj2.breadth = obj1.breadth;

		System.out.println(" Before Changing the value of object 1, the object2 will be - ");
		System.out.println(" Object2 Length = " + obj2.length + ", Object2 Breadth = " + obj2.breadth);

		// Changing the values for object1.
		obj1.length = 10;
		obj1.breadth = 20;

		System.out.println("\n After Changing the value of object 1, the object2 will be - ");
		System.out.println(" Object2 Length = " + obj2.length + ", Object2 Breadth = " + obj2.breadth);

	}

}
