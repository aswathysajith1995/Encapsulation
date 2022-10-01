package pkg1;

public class Atmpin {
	private int pin;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		if(pin==1001)
		{
		this.pin = pin;
		System.out.println("Pin is correct");
		}
		else if(pin==1234)
		{
			this.pin=pin;
			System.out.println("Pin is correct");
		}
		else if(pin==1212)
		{
			this.pin=pin;
			System.out.println("Pin is correct");
		}
		else
		{
			
			System.out.println("Not Matching");
		}
	}

}
