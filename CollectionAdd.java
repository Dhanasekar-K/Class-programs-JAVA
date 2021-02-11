package day13collection;

import java.util.ArrayList;

import java.util.Collections;

public class CollectionAdd {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		
		ArrayList b=new ArrayList();
	
		b.add(5);
		b.add(8);
		b.add(9);
		b.add(40);
		b.add(15);
		System.out.println("elements of array list"+b);	
		b.add(4, 18);
		
		System.out.println("elements of array list"+b);
		b.set(2, 77);
		System.out.println("elements of array list"+b);

		Collections.sort(b);
		System.out.println("after sort"+b);
		
		Collections.reverse(b);
		System.out.println("after reversing"+b);
		
		System.out.println("min value "+ Collections.min(b));
		System.out.println("max value "+ Collections.max(b));
	

		Collections.sort(b);
		System.out.println("after sort"+b);
		
		int index=Collections.binarySearch(b, 40);
		System.out.println("element found at "+index);
	
	}
	

}
