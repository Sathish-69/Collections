package HashMAp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer, String> x = new HashMap<>();
	
	x.put(1, "Sathish");
	x.put(2, "Gangula");
	x.put(3, "Btech");
	
	System.out.println( "before replace method ");
	for(Entry<Integer, String> b : x.entrySet()) {
System.out.println(b);
	}
	x.replace(3,"Mlritm");
	
	String abc = x.get(2);
	System.out.println("Accesing values using key " +abc);
	
	// for accesing integers only
	for (int cv  : x.keySet()) {
		System.out.println("Integers keys " +cv);
//for axcessing Strings values i.e values		
	}
	System.out.print("");
	for (String v  : x.values()) {
		System.out.println("values string= "+v);
	}
	// here both vwe can access key and values using entry set
	System.out.println( );
	for(Entry<Integer, String> xb : x.entrySet()) {
System.out.println(xb);
	}
	
	// contains check weather  key exist or not in it ;	// if not we can update are else print not exits 
	// if not we can update are else print not exits 
	// true are flase conditions like 
	if (!x.containsKey(4)) { 
		//System.out.println("s");
	/*	else 
			System.out.println("not exist");*/
	x.put(4, "virtusa");
	System.out.println("Update HashMap :\n" +x);
	}
	if (!x.containsValue("Graduation completed")) {
		//System.out.println("s");
	/*	else 
			System.out.println("not exist");*/
	x.put(5, "Graduation completed");
	System.out.print("update values \n" +x);
	}
	// replace all using lambda
	x.replaceAll((key, value) ->value.toUpperCase());
	System.out.println("\n" +x);
		// languages.replaceAll((key, value) -> value.toUpperCase());
	}
}