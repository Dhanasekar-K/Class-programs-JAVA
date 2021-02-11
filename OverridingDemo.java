package day7;

class Parent
{
	void property()
	{
		System.out.println("20");
	}


	void marry()
	{
		System.out.println("preethi");
		}
}

class Child extends Parent
{
	void marry()
	{
		System.out.println("i will marry xyz");
	}
}

public  class OverridingDemo {

	public static void main(String[] args) {

		//Child c=new Child();
		//c.property();
		//c.marry();
		
		Parent p=new Child();
		p.property();
		p.marry();
		
	}


}


