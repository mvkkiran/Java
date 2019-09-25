package practice;

public class SuccessiveAdd {
	public static void main(String args[])
	{
		String input="12369";
		char ch[]=input.toCharArray();
		int temp1=0,temp2=0;
		
		StringBuilder sb=new StringBuilder();
		
	sb.append(ch[0]);
	for(int i=1;i<ch.length-1;i++)
	{
	temp1=Character.getNumericValue(ch[i]);
	temp2=Character.getNumericValue(ch[i+1]);
	sb.append(temp2-temp1);
	
	}
		
	sb.append(ch[ch.length-1]);
	
	System.out.println(sb.toString());
		
	}

}
