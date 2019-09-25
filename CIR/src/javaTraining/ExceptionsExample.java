package javaTraining;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 0;
			int a = 10;
			int result = a / i;
			// ExceptionsExample.Divide();
		} 
		
		
		catch (ArithmeticException e) {
			System.out.println("exception occured " + e);
		}

		
		catch(Exception e){ System.out.println(e); } 
		 
		finally {
			System.out
					.println("This is from the finally block... which always executes...");
		}

		System.out.println("last statement is executed...");

	}

	public static void Divide() throws ArithmeticException {
		int i = 0;
		int a = 10;
		int result = a / i;
		throw new ArithmeticException();
	}

}
