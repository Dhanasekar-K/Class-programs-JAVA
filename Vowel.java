package day11;



public class Vowel {

	public static void main(String[] args) {
	
       String name="apple";
       int count=0;
       
       for(int i=0; i<name.length();i++)
       {
    	   char c=name.charAt(i);
    	   if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u')
    	   {
    		  count++; 
    		  System.out.println(c);
    	   }
    	 
       }
       System.out.println(count);
       
	}

}
