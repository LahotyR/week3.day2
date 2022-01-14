package week3.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		
	String str = "welcome to chennai";
	int counter = 0;
	char[] ca = str.toLowerCase().toCharArray();
	char test = 'e';
	
	// Arrays.sort(ca);
	
	for (int i = 0; i < ca.length; i++) {
		
		
		 if (ca[i] == test) {
			 counter++;
		 }
		
	}
		
	System.out.println("The count of character '" + test + "' is: " + counter);	
		
		
		
	}
	
}
