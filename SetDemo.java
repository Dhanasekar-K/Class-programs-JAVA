package day13collection;

import java.util.*;

public class SetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
    HashSet h=new HashSet();//own order(hash table)
    h.add(3);
    h.add(6);
    h.add(20);
    h.add("java");
    h.add("hello");
    h.add("java");
    
    System.out.println("hash set "+h);
    
    LinkedHashSet lh=new LinkedHashSet();
    //(Hash table +linked list)
    lh.add(3);
    lh.add(6);
    lh.add(20);
    lh.add("java");
    lh.add("hello");
    lh.add("java");
    
    System.out.println("linkedhash set "+lh);
		
	TreeSet t=new TreeSet();
    t.add(10);
    t.add(16);
    t.add(5);
    t.add(14);
    
    System.out.println("Tree Set "+t);
    
	
	TreeSet t1=new TreeSet();
    t1.add(new String("hello"));
    t1.add("hi");
    t1.add("apple");
    
    System.out.println(t1);
	
    TreeSet<StringBuffer> t2=new TreeSet<StringBuffer>();
    t2.add(new StringBuffer("hello"));
    t2.add(new StringBuffer("apple"));
    
    System.out.println(t2);
    
	}

}
