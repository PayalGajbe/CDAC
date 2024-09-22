package CollectionAssignment;
import java.util.*;
/*
 * 
 4) Write a Java program that merges two sorted lists of integers into a single sorted list.
 */
public class Program4 implements Comparable<Integer>{
	
	public static void display(Collection<?>c) {
		if(c==null)return;
		for(Object ob:c) {
			System.out.println(ob);
		}
	}
	@Override
	public int compareTo(Integer o) {	
		return 0;
	}

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		//add elements
		l1.add(10);
		l1.add(50);
		l1.add(30);
		l2.add(40);
		l2.add(70);
		l2.add(60);
		
		//merge
		l1.addAll(l2);
		
		//sort
		Collections.sort(l1);
		
		display(l1);
	}

}
