package com.kevin.exception;

public class RuntimeExceptionDemo {
	public static void main(String[] args) {

		testException();

		// Thrown when an application attempts to use null in a case where an object is required. These include:

		// Calling the instance method of a null object.
		// Accessing or modifying the field of a null object.
		// Taking the length of null as if it were an array.
		// Accessing or modifying the slots of null as if it were an array.
		// Throwing null as if it were a Throwable value.
		// Applications should throw instances of this class to indicate other illegal uses of the null object.
		sayHi(null);

		// Thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects. 
		// For example, the following code generates an ArrayStoreException:
		Object[] x = new String[3];
		x[0] = new Integer(3);

		// Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance. 
		// For example, the following code generates a ClassCastException:
		Object x1 = new Integer(0);
		System.out.println((String) x1);

		// Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
		// Applications can subclass this class to indicate similar exceptions.
		System.out.println(x[4]);

	}

	public static void testException() {
		try {
			Object[] x = new String[3];
			x[0] = new Integer(3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void sayHi(String s) {
		System.out.println(s.charAt(2));
	}
}

class FatherException extends Exception {

	private static final long serialVersionUID = 5985935213813478406L;

}

class ChildException extends FatherException {

	private static final long serialVersionUID = 6558534780780803043L;

}