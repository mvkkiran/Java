package example;

public class ExampleInterfaces{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 wheeler obj=new wheeler();
		 obj.accelerate();
		 obj.brake();
		 obj.start();

	}

}

interface vehicles{
	
	void accelerate();
	void brake();
	int start();
}

abstract class Car implements vehicles{
	public void accelerate(){
		
	}
	public void brake(){
		
	}
	
}
class wheeler extends Car{
	public int start()
	{
		return 10;
	}
}
