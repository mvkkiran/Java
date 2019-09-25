package example;

public class AccessSpecifiers extends class1 { // this is inheriting from parent class1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj=new class1();
		obj.add(); // as it is protected, it can be called from child class.
		//obj.sub(); // This throws an error as it is private and cannot be accessible in child class.
		
		//the below line for showing Integer type
		System.out.println(obj.s);
		//System.out.println("answer is"+i);
		
	}
	
	// Protected and Private cannot be used on classes and interfaces.

}
class class1{
	
	int i=100;
	
	Integer s=new Integer(10); // this is called as boxing
	
	protected void add()
	{
		System.out.println("Hello");
	}
	private void sub()
	{
		System.out.println("world");
	}
}

