package week3.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {


		String str = "madam";
		String rev = "";
		
		int length = str.length();
		
		for (int i = length-1; i >= 0; i--) {
			
			char c = str.charAt(i);
			// System.out.println(c);
			rev = rev + c;
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
		
	}

}
