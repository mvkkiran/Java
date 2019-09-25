package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		sample obj=new sample();
		
		Scanner scan= new Scanner(System.in);
		int x= scan.nextInt();
		
		int y= scan.nextInt();
		
		obj.add(a, b);
		obj.sub(x, y);
		scan.close();

	}

}

class sample
{
	void add(int x, int y)
	{
		int result=x+y;
		System.out.println(result);
		
	}
	
	void sub(int x, int y){
		
		if(x>y)
		{
			int result=x-y;
			System.out.println(result);
		}
		else
			System.out.println("result is negative");
		
	}
}