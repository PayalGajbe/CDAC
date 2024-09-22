package CollectionAssignment;
import java.util.*;
/*
 1)Write a Java program that takes a list of integers as input and returns a list of duplicate integers.
 */
public class Program1 {

	public static void main(String[] args) {
		//declare an arraylist which is a class that implements the List
		//List is an interface in java
		//It represent an ordered collections of elements.
		//List can contain duplicate unlike set
		//Can contain null values
		//Use non primitive datatype are allowed
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		//add elements in the list
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(10); //repeated value
		
		//print method #1 - for-each
		System.out.println("print method #1 - for-each: ");
		for(Integer ele:list1) {
			System.out.println(ele);
		}
		
		//print method #2 - iterator
		System.out.println("print method #2 - iterator: ");
		Iterator<Integer> i = list1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//print method #3 - listIterator
		//Listiterator  works only for list and in this we can get previous values also
		System.out.println("print method #3 - listIterator: ");
		ListIterator<Integer> j = list1.listIterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		//print method #4 - enumerator
		System.out.println("print method #4 - enumeration ");
		Enumeration<Integer> em = Collections.enumeration(list1);
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

	}

}
