package day12;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class IteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

System.out.println("elements are"+a);
	
      Iterator it=a.iterator();//1,2,3,4
	
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      System.out.println("=ListIterator=");  
	
      ListIterator listit=a.listIterator();
      
      System.out.println("forward direction");
      while(listit.hasNext()) {
    	  System.out.println(listit.next());
      }
      
      System.out.println("backward direction");
      while(listit.hasPrevious()) {
    	  System.out.println(listit.previous());
    	  
      }
}

}
