package dates;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class UnformattedDate {
	public static void main(String ar[])
	{
		Date date=new Date();
		System.out.println("SYstem dates is "+date);
		
		DateFormat df;
		df=DateFormat.getDateInstance(DateFormat.LONG,Locale.UK);
		System.out.println("United Kingdom: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.FULL,Locale.UK);
		System.out.println("United Kingdom: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
		System.out.println("United Kingdom: "+df.format(date));
		System.out.println();
	
		df=DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
		System.out.println("United States: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
		System.out.println("United States: "+df.format(date));
		df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
		System.out.println("United States: "+df.format(date));
	}

}
