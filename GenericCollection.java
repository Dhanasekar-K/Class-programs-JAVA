package day12;

import java.util.ArrayList;

public class GenericCollection {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
      ArrayList o1=new ArrayList();
      o1.add(1);
      o1.add("sachin");
      o1.add(true);
      o1.add(23.45);
		
	ArrayList<Integer> o2=new ArrayList<Integer>();
	o2.add(2);
      
    ArrayList<String> o3=new ArrayList<String>();
    o3.add("ajith");
	
	ArrayList<Employee> emp=new ArrayList<Employee>();
	emp.add(new Employee(1, "John"));
	emp.add(new Employee(2, "dan"));
	
	System.out.println(o1);
	
	}

}



class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}