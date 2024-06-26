package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {

	public static void main(String[] args) {
		arrayListManipulation();
	}
	public static void arrayListManipulation() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bonjour");
		System.out.println(al.size());
		System.out.println(al.get(0));
		al.add("Rebonjour");
		for(String s : al) {
			System.out.println(s);
		}
		System.out.println(al.contains("REbonjour"));;
		al.remove("Bonjour");
	}
	
	public static void hashMapManipulation() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,  "A");
		map.put(2,  "B");
		map.put(3,  "C");
		
		System.out.println(map.get(1));
		
		map.put(1, "AA");
		System.out.println(map.get(1));
	}
}
