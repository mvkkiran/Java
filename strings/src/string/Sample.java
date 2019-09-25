package string;

public class Sample {


	public static void main(String args[])
	{
		String a="hello";
		String b="h";
		
	b+="ello";
		
		System.out.println(a==b);
		System.out.println((Object)a==(Object)b);
		System.out.println(a.equals(b));
		
		StringBuilder sb=new StringBuilder();
		for(int i=65;i<75;i++)
		sb.append("hai").append((char)i).append(' ');
		
		System.out.println(sb);
	}

}
