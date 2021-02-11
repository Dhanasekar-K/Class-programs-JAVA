package encapsulation;

class Employee
{
	private int id;
	@SuppressWarnings("unused")
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
	
      Employee e= new Employee();
      e.setId(2);
      System.out.println("id:"+ e.getId() );
	}

}
