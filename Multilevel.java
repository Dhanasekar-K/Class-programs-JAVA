package day6;

class Parent
{
	int a=1;
	int b=2;
}

class Child1 extends Parent
{
	 int c=3;
}

class Child2 extends Child1
{
	int d=4;
	int result=a+b+c+d;
	
}

public class Multilevel {

	public static void main(String[] args) {
		
		
		Child2 f= new Child2();
		
		System.out.println("result:" + f.result);
		
	}

}
