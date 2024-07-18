package com.tk.d14;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List list1 = new ArrayList(); //Created empty raw ArrayList
		
		System.out.println("Size:"+list1.size()); //printing size of our list
		System.out.println("Is list empty? "+list1.isEmpty()); //false or true
		list1.add(10); //0
		list1.add(20); //1
		list1.add(true); //2
		list1.add(false); //3
		list1.add(20); //4
		list1.add("Hello"); //5
		list1.add(50.78);
		list1.add(20);
		list1.add('A');
		list1.add(5,"Hii");
		list1.add(10);
		System.out.println("List is: "+list1); //printing list1
		
		System.out.println("Is list contains 15: "+list1.contains(15));
		list1.remove(false);
		
		//need to give the index value for integer to remove from list
		
		System.out.println("List is: " +list1);
		
		System.out.println("Element at 5th location is:"+list1.get(5));
		System.out.println("Element removed: "+list1.remove(list1.lastIndexOf(10))); //last occurrence of list
		System.out.println("Element removed: "+list1.remove(list1.indexOf(10))); //particular occurrence
		
		System.out.println("List is: "+list1);
		
		
		list1.clear();
		System.out.println("List is: "+list1);
		
		//Generic : store and let us write the code which can able to access any type of data.
		//Define class with the type parameters and It is a method to operate on various objects
		
		List<String> names = new ArrayList<>();
		names.add("Amit");
		names.add("Manusri");
		names.add("Ashi");
		names.add("Muskan");
		names.add("Rishab");
		
		System.out.println("Reversed Name List is: "+names);
		
		//Traverse a list
		//Iterator used to loop through the collection
		//hasnext() : will allow us to check if there are more elements to iterate over (false / true)
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			
			if(nm.equals("Ashi"))
				i.remove();
		}
		System.out.println("Name List is: "+names);
		
		//Traverse in reverse
		ListIterator<String> li = names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm = li.previous();
			System.out.println(nm);
		}
		
		
		
		
	}

}

