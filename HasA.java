package day7;

class Employee
{
	int id;
	String name;
	String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
}

class Address
{
	int doorNo;
	String streetName;
	String city;
	public Address(int doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
	}
	
	void displayEmployeeInfo()
	{
		System.out.println("DoorNo:"+doorNo);
		System.out.println("Street name:"+streetName);
		System.out.println("city:"+city);
	}
	
}

public class HasA {

	public static void main(String[] args) {
		
		Address ad=new Address(234,"btm","bangalore");
		
		ad.displayEmployeeInfo();

	}

}
