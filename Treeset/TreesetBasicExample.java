package Treeset;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreesetBasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TreeSet<String> x = new TreeSet<>() ;
x.add("as");
x.add("ad");
x.add("xc");

Iterator<String> i =  x.iterator();
while (i.hasNext()) {

System.out.println(i.next());}

	

}}
