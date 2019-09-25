package dates;

import java.util.Date;

public class Dates {
	public static void main(String args[])
	{
Date d1=new Date(2012,07,14);

System.out.println("SYstem date is "+d1);

Date d2=new Date(2011,07,14);

int results=d1.compareTo(d2);

if(results>0)
	System.out.println("first date is after the second date");

else
	System.out.println("first date is before the second date");


	}

}
