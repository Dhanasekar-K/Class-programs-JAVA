package day10;

public class ExceptionExample {

	public static void main(String[] args) {
		 int a=4;
		 int b=4;
		 
		 
		 System.out.println("result is:");
		 try
		 {
			 int result=a/b;
			 System.out.println(result);
		 }
		  catch(ArithmeticException o)
		  {
			  System.out.println("cannot divide by zero "); 
		  }
		 finally
		 {
			 System.out.println("This statement runs irrespective of exception");
		 }
	}

}
