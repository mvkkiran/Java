package javaTraining;

public class MethodOverriddingOverloading {

	public void Display() {
		System.out.println("This is from the Display function...");
	}

	public static void Display(String s) {
		System.out.println("This is from another Display method: " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example for method overloading.
		MethodOverriddingOverloading obj = new MethodOverriddingOverloading();
		obj.Display();
		MethodOverriddingOverloading.Display("Kiran");

		// example for method overriding
		Bike2 objBike = new Bike2();
		objBike.run();

	}

}

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike2 extends Vehicle {
	void run() {	// this overrides the run() method in the parent class.
		System.out.println("Bike is running safely");
	}
}
