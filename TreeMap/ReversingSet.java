package TreeMap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReversingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stubInt
		TreeMap<Integer, String > x = new TreeMap<>();
		x.put(14, "sah");
		x.put(142, "sathish");
		x.put(1430, "Info");
		
		Set<Integer> x1 = x.descendingKeySet();
		for (Integer x3 : x1) {
			System.out.println( x.get(x3));
		}
	}

}
