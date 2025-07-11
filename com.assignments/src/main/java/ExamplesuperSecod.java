
public class ExamplesuperSecod extends ExampleSUper{
	
	public void display() {
	
int z=	super.cal(1212, 9);
	
	if (z%10==0)
	{

		System.out.println("The number is  divisible by 10   "  +z);
		
	}else 
	{
		System.out.println("The number is not divisible by 10   "  +z);
	}
	}

	public static void main(String[] args) {
		 
		ExamplesuperSecod sec=new ExamplesuperSecod();
		sec.display();
		
	}

}
