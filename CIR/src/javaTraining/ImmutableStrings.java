package javaTraining;



public class ImmutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Amrita";
		str.concat("College");
		System.out.println(str);	// here still str is pointing to memory where Amrita is value
		
		
		str=str.concat("Vishwa Vidyapeetham");
		System.out.println(str);	/* here we have created a new string that contains the concatenated string.
		Please note that the previous str is still having value Amrita*/
		
		
		String s="Hai";
		
		s=s+" Vamsee";
		s=s+"..!";
		System.out.println(s);	//Please note for every modification that we do on strings a new string object is created in the heap.

	}

}
