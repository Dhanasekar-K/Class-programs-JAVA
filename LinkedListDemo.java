package day13collection;

import java.util.*;

public class LinkedListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		LinkedList l=new LinkedList();
		l.add(2);
		l.add(5);
		l.addFirst(10);
		l.addLast(4);
		l.add(25);
		
		
System.out.println("linked list "+l);

l.removeFirst();
System.out.println("linked list "+l);

l.removeLast();
System.out.println("linked list "+l);


	}

}
