package example;

public class ConstructorsExample {

	private int age, height;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorsExample obj = new ConstructorsExample();
		//ConstructorsExample obj1 = new ConstructorsExample();
		ConstructorsExample obj2 = new ConstructorsExample(10, 5);

	}

	ConstructorsExample() // default constructor
	{
		this(20, 30); // constructor chaining
		System.out.println("Constructor is called...");

	}

	ConstructorsExample(int a, int h) { // parameterized cons
		age = a;
		height = h;

		System.out.println("constructor with age " + age + " and height "
				+ height + " is called...");
	}

}
