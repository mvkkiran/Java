package hash;
import java.util.*;

public class Hash {
public static void main(String args[])
{
	HashMap<String, List<String>> hm=new HashMap<String, List<String>>();
	
	List<String> one= new ArrayList<String>();
	one.add("Kiran");
	one.add("kranthi");
	
	List<String> two= new ArrayList<String>();
	two.add("Sneha");
	two.add("Shivam");
	
	List<String> three= new ArrayList<String>();
	three.add("Ankith");
	three.add("Anitha");
	
	hm.put("A", three);
	hm.put("K", one);
	hm.put("S", two);
	
	
	System.out.println("Printing keys and values stored in it ");
//	for(Map.Entry<String, List<String>> entry:hm.entrySet()){
//		String key=entry.getKey();
//		List<String> values=entry.getValue();
//		
//		System.out.println("Key "+key);
//		System.out.println("Corresponding values are "+values);
//	}
	Set<String> keys=hm.keySet();
	
	Iterator<String> i=keys.iterator();
	
	for (String key : keys) {
		System.out.println("keys are "+key);
	}
	while(i.hasNext()){
		String s=(String)i.next();
		System.out.println(hm.get(s));
		
		
	}
	
}
}
