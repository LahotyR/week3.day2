package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public void duplicates() {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		int count;
		Set<String> set = new LinkedHashSet<String>();
		set.addAll(Arrays.asList(split));
		System.out.println(set);

	}
	
	public static void main(String[] args) {
		RemoveDuplicates remove = new RemoveDuplicates();
		remove.duplicates();
	}
	
}
