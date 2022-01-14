package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public void checkAnagram() {
		
	String str = "stops";
	String str2 = "potss";
	
	boolean status = false;
	
	if(str.length() != str2.length()) {
		
		System.out.println("String lengths don't match");
		status = false;
		
		} else {
			
		char[] charArray1 = str.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		status = Arrays.equals(charArray1, charArray2);
		
			if (status) {
				System.out.println("String is an anagram");
			} else {
				System.out.println("String is not an anagram");
			
		}
		}

	}
	
	public static void main(String[] args) {
		
		Anagram ana = new Anagram();
		
		ana.checkAnagram();
		
	}
}
