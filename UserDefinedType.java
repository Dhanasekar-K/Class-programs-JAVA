package day13collection;

import java.util.*;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class UserDefinedType {

	public static void main(String[] args) {
	
   ArrayList<Employee> emp=new ArrayList<Employee>();
   emp.add(new Employee(1,"sam"));
   emp.add(new Employee(2,"dan"));
   emp.add(new Employee(3,"john"));
   
   for(Employee e: emp) 
   {
   System.out.println(e.id+" "+e.name);
   }
		
		
	}

}
