package day7;

public class Overloading {
	
	void displayInfo()
	{
	System.out.println("zero parameter");	
	}

	void displayInfo(int id)
	{
		System.out.println("Id:"+ id);	
	}
	
	void displayInfo(String name)
	{
		System.out.println("Name:"+ name);
	}
	
	void displayInfo(int id,String name)
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
	}
	
	void displayInfo(String name,int id)
	{
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
	}




	public static void main(String[] args) {
		
		Overloading obj= new Overloading();
		obj.displayInfo(2,"Dhanasekar");
		

	}

}
