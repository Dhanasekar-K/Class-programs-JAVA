package day11;

public class Duplicate {

	public static void main(String[] args) {
		
       String s="apple";
       String s1="";
       for(int i=0;i<s.length();i++)
       {
    	  char c=s.charAt(i) ;
    	 
    	  if(c!=' ')
    	  {
    		  s1=s1+c;
    		s=s.replace(c, ' ')  ;
    	  }
    	 
       }
       System.out.println(s1); 
	}

}
