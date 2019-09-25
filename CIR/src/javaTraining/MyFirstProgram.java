package javaTraining;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the First Program...!");
		System.out.println(args[0] + " " + args[1]);

	}

}

class SecondClass {
	public static void Add(String[] args) {
		MyFirstProgram.main(null);
		System.out.println("This is from the second class...!");
	}
}
