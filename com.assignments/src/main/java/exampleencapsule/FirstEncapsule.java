package exampleencapsule;

public class FirstEncapsule {
	
	private int pin;
	
	
	public int getPin() {
		
		return pin;
	}
	
	public void setPin(int pin) {
		
		this.pin=pin;
	}
	
	public int validate() {
		
		if(pin==1001||pin==1002||pin==1003){
			
			System.out.println("pin is valid");
			
			
			
		}
		
		else {
			System.out.println("The pin is invalid");
			
			
		}
		return pin;
		
	}

}
