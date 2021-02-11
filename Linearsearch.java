package day4;

public class Linearsearch {

	public static void main(String[] args) {
	
		
		int a[]= {2,8,6,5,19,13,17};
		
		int findnumber=17;
		int location=0;
		int flag=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==findnumber)
			{
				location=i;
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("the element is found " +location);
		
		}
		else
		{
			System.out.println("the element is not found");
		}

	}

}
