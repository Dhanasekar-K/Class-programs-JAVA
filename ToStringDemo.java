package day6;

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

public class ToStringDemo {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee(1,"sachin");
		Employee emp2=new Employee(2,"ravi");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		

	}

}
