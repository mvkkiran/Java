package javaTraining;


import java.util.ArrayList;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Output="";
		ArrayList<String> Names=new ArrayList<String>();
		Names.add("Domnic");
		Names.add("Brian O'Conner");
		Names.add("Dwayne Johnson");
		
		for (String s : Names) {
			Output=Output+" "+s;
		}
		
		System.out.println(Output);
	//Explanation for StringBuilder class.	
		StringBuilder sb= new StringBuilder();
		for (String s : Names) {
			sb.append(s+" ");
		}
		System.out.println(sb.toString());
		
		
	//This explains toCharArray function in String class.	
		char[] NameArray=new char[100];
		NameArray=Output.toCharArray();
		System.out.println(NameArray);
		NameArray[1]='R';
		System.out.println(NameArray);
	}

}
