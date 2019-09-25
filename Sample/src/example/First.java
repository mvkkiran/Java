package example;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		
		Addition objAdd=new Addition();  
		First o1=new First();
		int r= First.subtract(11, 21);
		System.out.println("Sub is "+r);
		
		// Addition objAdd;	//creating reference
		// objAdd=new Addition(); // allocating memory is done only when new is called.
		
		int result=objAdd.add(10, 20);
		System.out.println("Addition is "+result);
		
		
	}
	
	public static int subtract(int x, int y) { // use ctrl+shift+f to format the code
		int sub = 0;
		if (x < y) {
			System.out.println("The result will be negative");
		} else {
			sub = x - y;

			// System.out.println("subtraction is" +sub);
		}
		return sub;
	}
}

class Addition
{
	int add(int x, int y)
	{
		int c=x+y;
		return c;
	}
}