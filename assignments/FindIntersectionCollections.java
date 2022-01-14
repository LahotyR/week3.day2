package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;

//import org.apache.poi.hpsf.Array;

public class FindIntersectionCollections {

public void intersection() {
		
		int[] array1 = {3,2,11,4,6,7};	 
		int[] array2 = {1,2,8,4,9,7};
		
		boolean equal = array1.equals(array2);
		
		System.out.println(equal);
	}

	/* public void coll() {
	
	ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
	ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
	
	array1.retainAll(array2);
	System.out.println(array1);
	
	} */

	public static void main(String[] args) {
	
		FindIntersection find = new FindIntersection();
		//find.intersection();
		
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		array1.retainAll(array2);
		
		System.out.println(array1);
	}
	
}
