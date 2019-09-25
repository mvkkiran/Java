package practice;

import java.util.Arrays;

public class Anagrams {
	public static void main(String args[])
	{
		String word1="teacher si";
		String word2="cheater is";
		
		char ch[]=word1.replaceAll("[\\s]", "").toCharArray();
		char ch1[]=word2.replaceAll("[\\s]", "").toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		
		if(Arrays.equals(ch, ch1)){
			System.out.println("anagram");
		}
		else
			System.out.println("not anagram");
	}

}
