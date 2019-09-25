package sample;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
		int a=10, b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	
	}
}
