package kiran;
import kiran.Calculate;

public class Second {
	public static void main(String args[])
	{
Calculate c=new Calculate();

int sum=c.add(20, 10);
int sub=c.sub(20, 10);
int mul=c.mul(20, 10);
int div=c.div(20, 10);


System.out.println("Addition is "+sum);
System.out.println("Difference is "+sub);
System.out.println("Product is "+mul);
System.out.println("Division is "+div);

	}
}
