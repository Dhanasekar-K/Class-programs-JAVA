package day10;



public class ThrowDemo {
	
	
void loginTime(int time)
{
	System.out.println("login time is:"+time);
	if(time>9)
	{
		throw new ArithmeticException("absent");
	}
	else
	{
		System.out.println("present");	
	}
}

	public static void main(String[] args) {
		
		//throw new ArithmeticException("Throws exception");
		ThrowDemo t= new ThrowDemo();
		t.loginTime(8);

	}

}
