package day8;

abstract class Operation
{
	
	abstract void numbers(int a,int b);
	
}

class Sachin extends Operation
{
	@Override
	void numbers(int a,int b)
	{
		System.out.println(a+b);
	}
	
}

class Rahul extends Operation
{
	@Override
	void numbers(int a,int b)
	{
		System.out.println(a-b);
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Sachin s= new Sachin();
		s.numbers(3,4);
		Rahul r= new Rahul();
		r.numbers(9,5);
		

	}

}
