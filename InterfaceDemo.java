package day8;

interface Employee
{
	int loginhours=8;
	
	void designation();
	
}

interface Employee1
{
	
}

class Manager implements Employee,Employee1
{

	@Override
	public void designation() 
	{
	  System.out.println("i manage the team for 4 clients");
	  
	  System.out.println("i work for"+" "+ loginhours+" " +"hours");
	  
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		
		Manager m= new Manager();
		m.designation();
	

	}

}
