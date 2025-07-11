
public class Examplestatic{
	
	
	int age;
	String name;
	
	static String college="MTCS";
	
	Examplestatic (int a,String name){
		
		age=a;
		name=name;
		
		
	}
	
	
	public  void display() {
		
		
		System.out.println(age+"   "+name+"   "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Examplestatic example1=new Examplestatic(111,"Ash");
		Examplestatic example2=new Examplestatic(111,"Aih");
		Examplestatic.college="BBIH";
		example1.display();
		example2.display();
		
	}

}
