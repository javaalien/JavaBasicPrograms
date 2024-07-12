package com.alien;

// We can create our own marker interface, but it has nothing to do with JVM, 
// we can add some checks with instanceOf.

interface Marker {

}

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

class A {
	void m1() throws MyException {
		if ((this instanceof Marker)) {
			System.out.println("successful");
		} else {
			throw new MyException("Must implement interface Marker ");
		}
	}
}

public class OwnMarkerInterface extends A implements Marker {

	public static void main(String[] args) {
		OwnMarkerInterface mark = new OwnMarkerInterface();
		try {
			mark.m1();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
