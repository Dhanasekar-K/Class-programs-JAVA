package day13collection;

import java.util.*;

public class MapDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put(1, "danny");
		h.put("sam", "rahul");
		h.put(1, "randy");
		
		 System.out.println(h);
		 System.out.println(h.get(1));
		 System.out.println(h.containsKey(1));
         
		 h.clear();
		 System.out.println(h);

		 
	}

}
