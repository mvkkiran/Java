package example;

public class MethodOverloading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj=new A();
		obj.add();
	}


}
class B{
	public void add() {
		System.out.println("This is from main class");
	}
}

class A extends B
{
	public void add(){
		System.out.println("called from child class...");
		super.add();
	}
	
}
