package week3.day2.assignments;

import java.util.Arrays;

public class ReverseEvenWords {
	
	
	void reverseWords() {
		String test = "I am a software tester";
		String rev = "";
		String total = "";
		
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {

		 if (i>0 && i%2==1) {
			char[] charArray = split[i].toCharArray(); 
			
			for (int j = charArray.length-1; j >= 0; j--) {
				
				rev = charArray[j] + rev;
						
				System.out.println(rev);
			}
			
			//total = total + rev[i] + " ";
			 rev = "";
			 //System.out.println(total);
			  
		 } else {
			 
			 System.out.println("There is only one word in the string");
		 }
		
		}
		
	}
	
	public static void main(String[] args) {
		
		ReverseEvenWords reverse = new ReverseEvenWords();
		reverse.reverseWords();
	}

}
