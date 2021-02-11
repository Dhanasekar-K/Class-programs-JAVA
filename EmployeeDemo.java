package day5;
 
class Employee
{
	// variable or attribute
	int employeeId;
	String name;
	double salary;
	
	void displayEmployeeDetails()
	{
		System.out.println("id is:" +employeeId);
		System.out.println("name is:" +name);
		System.out.println("salary is:" +salary);
		
	}
	
	String checkForloanOption()
	{
		if(salary>75000.00)
			return "you can apply for loan";
		return "you cannot apply for loan";
	}
	
	
	
	
	
	
}
public class EmployeeDemo {

	public static void main(String[] args) {

		 System.out.println("Employee Demo");
		 
		 Employee ramesh = new Employee();
		 
		 ramesh.employeeId = 123;
		 ramesh.name="ramesh";
		 ramesh.salary=45000;
		 
		 ramesh.displayEmployeeDetails();
		 //string message = ramesh.checkForloanOption();
		  System.out.println(ramesh.checkForloanOption());

	}

}

