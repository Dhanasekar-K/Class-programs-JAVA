package day6;

class Parent1
{
    Parent1(int id,String name)
    {
    	System.out.println("this is parent constructor");	
    }
}

class Child extends Parent1
{
  Child(int id,String name)
  {
	  super(10,"sam");
	  System.out.println("this is child constructor");
	  System.out.println("id:"+id +" "+  "name:"+name);
  }
}

public class SuperCunstructorDemo {
	
   public static void main(String[] args) {
   
	 
	
   }
}
