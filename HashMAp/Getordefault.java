package HashMAp;

import java.util.HashMap;

public class Getordefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> x = new HashMap<>();
		
		x.put(1, "Sathish");
		x.put(2, "Gangula");
		x.put(3, "Btech");
		String cv = x.getOrDefault(1, "not found ");
		
				System.out.println(cv );
				
	
			System.out.println(" ");
	String c = x.getOrDefault(4, "not found we need add in hashmap ");
	
	System.out.println(c );
}
}