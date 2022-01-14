package week3.day2.assignments;

//import java.util.Arrays;

public class FindTypes {
	
	public void typesTest() {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int countCh = 0;
		int countInt = 0;
		int countSpace = 0;
		int countSC = 0;
		
		char[] testArray = test.toCharArray();
		
		for (int i = 0; i < testArray.length; i++) {
			
			if ((testArray[i] >='a' && testArray[i] <='z') || (testArray[i] >='A' && testArray[i] <='Z')) {
				
				// System.out.println("The letter " + testArray[i] + " is a character");
				countCh++;
				
			} else if (testArray[i] >='0' && testArray[i] <='9') {
				// System.out.println("The letter " + testArray[i] + " is an integer");
				 countInt++;
			
			} else if (testArray[i] == ' ' || testArray[i] == '\n') {
				 // System.out.println("The letter " + testArray[i] + " is a whitespace");
				 countSpace++;
			
			} else {
				
				// System.out.println("The letter " + testArray[i] + " is a special character");
				countSC++;
			}
			
			
		}
		
		System.out.println("Character count: " + countCh);
		System.out.println("Integer count: " + countInt);
		System.out.println("Spaces count: " + countSpace);
		System.out.println("Special character count: " + countSC);
		
	} 
	public static void main(String[] args) {
		FindTypes type = new FindTypes();
		type.typesTest();
	}

}
