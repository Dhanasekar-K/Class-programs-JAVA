package day9;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	
		int a=10;
		int b=10;
		int arr[]= new int[5];
		
		System.out.println("hello");
		try
		{
		System.out.println(a/b);
		System.out.println("one");
		arr[7]=10;
		System.out.println("two");
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
	    System.out.println("Array index out of bound");
		}
		catch(Exception ex)
		{
			System.out.println("divide by zero");	
		}
		System.out.println("thank you");
		

	}

}
