package CollectionAssignment;
import java.util.*;
/*
 2)Create a Person class with attributes name and age. Write a Java program that sorts a list of Person objects first by age and then by name if the ages are equal.


 */

class Person implements Comparator<Object>{
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" age: "+age;
	}

}

public class Program2 {
	
	public static void display(Collection <?> c) {
		for(Object ob:c) {
			System.out.println(ob);
		}
	}
//
	public static void main(String[] args) {
		List<Person> p1 = new ArrayList<Person>();
		
		p1.add(new Person("lee",30));
		p1.add(new Person("dee",25));
		p1.add(new Person("wee",24));
		p1.add(new Person("ree",28));
		
		Comparator<Person> comparator = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				Integer ageCompare = Integer.compare(p1.age, p2.age);
				
				if(ageCompare == 0) {
					return p1.name.compareTo(p2.name);
				}
				else {
					return ageCompare;
				}
			}
		};
		Collections.sort(p1, comparator);
		
		for(Person ele:p1) {
			System.out.println(ele);
		}

	}

}
