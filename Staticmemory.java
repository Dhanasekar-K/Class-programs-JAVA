package day5;

class Student
{
	int id;
	String name;
	static String collegeName="abc";
}

public class Staticmemory {

	public static void main(String[] args) {
		
     Student ravi= new Student();
     ravi.id=12;
     ravi.name="ravi";
     
     System.out.println(ravi.id +" "+ ravi.name);
	}

}
