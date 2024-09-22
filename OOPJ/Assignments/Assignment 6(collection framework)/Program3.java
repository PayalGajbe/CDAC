package CollectionAssignment;

import java.util.*;

/*
 3)Write a Java program to find the first non-repeated character in a string using a HashMap.


String input = "aabbccddeffg";
Expected output = 'e';


*/
public class Program3 {

	public static void main(String[] args) {
		
		String input = "aabbcceddffg";
		
		//created a hashmap with character as a key and integer as a value
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		
		//loop 1 for input to check for null
		//should start from 0 and go put to length of input i.e 12
		for(int i=0;i<input.length();i++) {
			//checking if not null then 
			if(hs.get(input.charAt(i)) != null) {
				hs.put(input.charAt(i), hs.get(input.charAt(i)) + 1);
			}else {
				hs.put(input.charAt(i), 1);
			}
		}
		//loop2 for checking the value equals 1 or not if does its the non repeating char
		for(int i = 0;i<input.length();i++) {
			if(hs.get(input.charAt(i)) == 1) {
				System.out.println("first non repeating character is "+input.charAt(i));
				break;
			}else {
				if(i == input.length() - 1) {
					System.out.println("no non repeated character");
				}
			}
		}
		
		
	}

}
