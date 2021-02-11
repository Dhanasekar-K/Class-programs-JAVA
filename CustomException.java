package day10;


@SuppressWarnings("serial")
class LateException extends RuntimeException
{
	String msg;
	public LateException(String msg) {
		super();
		this.msg=msg;
		System.out.println("this a constructor in late exception class");
	}
}
class StudentDemo
{
	void loginTime(int time) throws LateException
	{
		if(time>=9)
		{
			throw new LateException("you are absent");
		}
		else
		{
			System.out.println("you are present");
		}
	}
}


public class CustomException {

	public static void main(String[] args) {
		
		StudentDemo ob=new StudentDemo();
		ob.loginTime(8);
		

	}

}
