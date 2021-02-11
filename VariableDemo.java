package day5;

public class VariableDemo {

	int a=10; //global variable
	static int b=20; //static variable
	void fun1(int x) // x is a local variable
	{
	System.out.println("value of a"+ a);
	System.out.println("value of x"+ x);
	}
	
	void fun2(int y) // y is a local variable
	{
	System.out.println("value of a"+ a);
	System.out.println("value of x"+ y);
	}	
	
	
	
	
	
	public static void main(String[] args) {
	VariableDemo variabledemo= new VariableDemo();//heap area
		
		
		System.out.println (variabledemo.a);
		System.out.println(b);
		variabledemo.a=45;//instance variable
		

	}

}
