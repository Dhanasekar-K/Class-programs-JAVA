package day7;

public class Fibbonacci {

	public static void main(String[] args) {
		int n=10, m=0, p=1;
	
		
		for(int i=1;i<=n;++i)
		{
			System.out.println(m+" ");
			int sum=m+p;
			m=p;
			p=sum;
			
			
		}

	}

}
