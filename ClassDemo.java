package day13collection;

import java.util.ArrayList;

import java.util.Collections;


public class ClassDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
      ArrayList javabatch=new ArrayList();
		
		javabatch.add("aarti");
		javabatch.add("abhay");
		javabatch.add("deepa");
		javabatch.add("darshan");
		javabatch.add("sarita");
		System.out.println("elements of array list"+	javabatch);
	
		
	      ArrayList softskillbatch=new ArrayList();
			
	      softskillbatch.add("anjali");
	      softskillbatch.add("nikil");
	      softskillbatch.add("aarti");
	      softskillbatch.add("deepa");
	      softskillbatch.add("pavan");
		
	      System.out.println("elements of array list"+	softskillbatch);
	
	softskillbatch.removeAll(javabatch);
	 System.out.println(softskillbatch);
	 
	 softskillbatch.addAll(javabatch);
	 System.out.println(softskillbatch);
	 
	 Collections.sort(softskillbatch);
	 System.out.println(softskillbatch);
	 
	 
	}

}
