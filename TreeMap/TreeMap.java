package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.TreeMap<Integer, String> ap = new java.util.TreeMap();
		ap.put(100, "Sathish");
		ap.put(11, "Gangula ");
		ap.put(143,"virtusa");
		
		
		Set <Map.Entry<Integer , String >> entries=  ap.entrySet();
		for (Map.Entry<Integer, String> x : entries) {
			System.out.print(x.getValue()+ " -> "+ x.getKey() +"\n");
		
		}
		System.out.println("Using iterator "  +"\n");
		Iterator<Map.Entry<Integer ,String> > l = entries.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		
		

	}

}
