package exception;

public class First {

	public static void main(String args[])
	{

	try{
		First f=new First();
		f.kiran();
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("array range not suff");
	}
		//System.out.println("This is the line after catch block");
		
		
	}
	public void kiran(){
		try{
			int arr[]=new int[2];
			System.out.println("accessing element 3 in array "+arr[3]);
				
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("exception catched...accessing value beyond the memory");
				throw e;
				
			}
			finally{
				System.out.println("This is the finally block");
				}
	}
}

