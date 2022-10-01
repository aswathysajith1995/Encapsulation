package pkg1;
import java.util.*;
public class AtmUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Atmpin obj=new Atmpin();
Scanner s=new Scanner(System.in);
System.out.println("Enter the pin");
int n=s.nextInt();
obj.setPin(n);
System.out.println(obj.getPin());
	}

}
