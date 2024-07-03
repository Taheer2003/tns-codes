package com.tk.d14;



import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Sloth");
		System.out.println("Initial Vector: " +animals);
		
		//using get method
		String element = animals.get(2);
		System.out.println("element at index 2:" +element);
		
		//iterator
		
		Iterator<String> iterate = animals.iterator();
	//	System.out.println("Vector: ");
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(", ");
		}
		element=animals.remove(1);
		System.out.println("Removed Element:" +element);
		System.out.println("New vector: "+animals);

	}

}

