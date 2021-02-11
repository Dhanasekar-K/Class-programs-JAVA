package day6;

class Compose
{
	String email="ravi@gmail.com";
	String message="hello";
}

class SentMail extends Compose
{
	String status="delivered";
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Compose c=new Compose();
		
		System.out.println(c.email);
		System.out.println(c.message);
		
		SentMail s=new SentMail();
		
		System.out.println(s.email);
		System.out.println(s.message);
		System.out.println(s.status);
		
		
		

	}

}
