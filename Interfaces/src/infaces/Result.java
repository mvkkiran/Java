package infaces;

public class Result{
//	
//	public void dog() {
//		System.out.println("this is dog");
//		}
	
	public static void main(String args[])
	{
		First f=new First() {	// here we are actually creating an object for abstract class First
			// therefore an anonymous class is created and object is created for that class.
			// Now this anonymous class needs definition for the abstract method that is not implemented.
			@Override
			public void dog() {
				// TODO Auto-generated method stub
				System.out.println("this is dog");
			}
		};
		f.cat();
		f.dog();
	}

}
