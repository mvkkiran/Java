package javaTraining;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String obj1 = new String("Arnold");

		String obj2 = new String("Arnold");

		/*
		 * Both objects though have same value points to two different
		 * locations. checks to see if the 2 object names are basically
		 * references to the same memory location
		 */
		if (obj1 == obj2) // == is used to compare two objects.
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

		// lets check the same using equals method
		if (obj1.equals(obj2))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

		
		
		String obj3 = obj1; // here both refer to the same memory location.
		if (obj1 == obj3)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
