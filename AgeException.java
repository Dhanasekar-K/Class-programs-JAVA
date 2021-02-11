package day10;

public class AgeException {
	
	void age(int age)
	{
		System.out.println("age is:"+age);
		if(age<18)
		{
			throw new ArithmeticException("you cannot vote");
		}
		else
		{
			System.out.println("you can vote");	
		}
	}


	public static void main(String[] args) {
		
		AgeException t= new AgeException();
		t.age(20);


	}

}
