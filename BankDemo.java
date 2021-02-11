package day7;

class Bank
{
	void rateOfInterest()
	{
      System.out.println("2%");
	}
	void minBalance()
	{
		System.out.println("1000 Rs");
	}
}
class Axis extends Bank
{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
}
class Icic extends Bank
{
	void minBalance()
	{
		System.out.println("500Rs");
	}
	
}
public class BankDemo {

	public static void main(String[] args) {
		
		Bank ic=new Icic();
		Bank ax=new Axis();
		
		ic.rateOfInterest();
		ic.minBalance();
		ax.rateOfInterest();
		ax.minBalance();
		
		
		

	}

}
