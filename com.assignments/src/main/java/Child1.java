
public class Child1 extends Parent1{
	
	
	int age;
	char z;
	
	
public void display(int num, char c) {
	
	this.age=num;
	this.z=c;
	
	System.out.println(num+ " "+c);
	
	
	
	
	
	
}
	public static void main(String[] args) {
		Parent1 parent=new Parent1();
		parent.display(30, 'a');
		
		Child1 child=new Child1();
	child.display(23,'s');	
		

	}

}
