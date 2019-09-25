package javaTraining;

public class ThisExample {
	int id;
	String name;

	ThisExample(int id, String name) {
		this(); // invoking the parent default constructor.
		id = id; // change to this.id=id;
		name = name;
	}

	ThisExample() {
		System.out.println("This is from default constructor...");
	};

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisExample s1 = new ThisExample(111, "Kiran");
		ThisExample s2 = new ThisExample(222, "Karan");
		s1.display();
		s2.display();

	}

}
