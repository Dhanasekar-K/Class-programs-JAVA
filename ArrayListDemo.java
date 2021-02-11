package day12;

import java.util.ArrayList;


public class ArrayListDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList o=new ArrayList();//index 10
		ArrayList o1=new ArrayList(30);// index 30
		System.out.println("size of array"+o.size());
		System.out.println("elements of array list"+o);
		
		o.add(1);// integer i=1;  int=1;
		o.add("sam");
		o.add('c');
		o.add(23.45);
		o.add("danny");
		o1.add(null);
		o.add(4, "John");
		
		System.out.println("size of array after adding elements"+o.size());
		System.out.println("elements of array list"+o);
		
		System.out.println("exists "+ o.contains("sam"));
		System.out.println("index "+o.indexOf('c'));
		System.out.println(o.get(3));	
	
		o.remove(Integer.valueOf(1));
		
		System.out.println(o);
		
		o.add(4, "Bangalore");
		System.out.println(o);
	}

}
