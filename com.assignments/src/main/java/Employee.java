
public class Employee {

	
	private String name;
	
	public String getName() {
		
		
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("vijay");
		
		System.out.println(emp.getName());
	}

}
