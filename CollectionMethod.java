package day12;

import java.util.ArrayList;

public class CollectionMethod {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
ArrayList a=new ArrayList();
a.add(1);
a.add(2);
a.add(3);
a.add(4);

System.out.println(a);

ArrayList a1=new ArrayList();
a1.add(3);
a1.add(4);
a1.add(5);
a1.add(6);

System.out.println(a1);
		
	//a1.addAll(a);//it adds a collections with a1
	//System.out.println(a1);
	
	//a1.removeAll(a);
	//System.out.println(a1);
	
    a1.retainAll(a);
    System.out.println(a1);

	}

}
