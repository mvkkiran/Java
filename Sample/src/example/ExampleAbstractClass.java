package example;

public class ExampleAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		male obj = new male();
		obj.walk();
	}

}
abstract class humans{

	public void walk(){
		System.out.println("Humans can walk...");
	}
	abstract void run();
}

class male extends humans{
	public void run(){
		System.out.println("Humans can run...");
	}
}
