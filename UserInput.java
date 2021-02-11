package day9;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
	int a,b,result = 0;	
     @SuppressWarnings("resource")
	Scanner s= new Scanner(System.in);
     System.out.println("enter two numbers");
     
     System.out.println("enter value of a");
     a=s.nextInt();
     
     System.out.println("entr value of b");
     b=s.nextInt();
     
     try
     {
        result=a/b;
     }
     catch(ArithmeticException e)
     {
    	 System.out.println("do not give zero");
     }
     finally
     {
    	 System.out.println("closing statement"); 
     }
     
     System.out.println(result);
     
	}

}
