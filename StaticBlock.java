package day5;

public class StaticBlock {
	
	static
	{
		System.out.println("this is static block 1");
		
	}

	public static void main(String[] args) {
		System.out.println("hello");
		

	}
	static {
		
	
	System.out.println("this is static block 2");
	}
}
