
public class Exam {
	
	
	String emp;
	float salary;
	
	Exam(float salary,String emp){
		
		this.emp=emp;
		this.salary=salary;
		
		
	}
	
	public char display(char c) {
		
		return c;
		
		
		
		
	}

	public static void main(String[] args) {
		Exam e=new Exam(52.7f,"Aishwarya");
		System.out.println(e.emp+ " "+e.salary);
		
		System.out.println(e.display('z'));
		

	}

}
