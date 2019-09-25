package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Operations.addition(x,y);
		// to give command line args, goto run->run configurations -> arguments tab
		//specify as 10 20
		
		int i=10; // primitive type
		Integer c=new Integer(10); // object type
		
		System.out.println("enter inputs for multiplication:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		Operations.multiply(a, b);
		
		System.out.println("enter inputs for Division:");
		Scanner scan= new Scanner(System.in);
		int l= Integer.parseInt(scan.next());
		int m= Integer.parseInt(scan.next());
		Operations ob=new Operations();
		ob.divide(l, m);
		
		

	}

}

class Operations{
	static void addition(int x, int y)
	{
		int result=x+y;
		System.out.println("Addition is "+ result);
	}
	static void multiply(int x,int y)
	{
		int mul=x*y;
		System.out.println("multiplication is " + mul);
	}
	
	void divide(int x, int y) {
		int div = 0;
		if (y != 0) {
			div = x / y;
			System.out.println("Division is" + div);
		} else
			System.out.println("divide by 0 error");
	}
}
