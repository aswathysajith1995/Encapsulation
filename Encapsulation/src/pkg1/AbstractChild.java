package pkg1;

public class AbstractChild extends Abstract1 {

	public static void main(String[] args) {
		Abstract1 obj=new AbstractChild();
		obj.display();
		obj.print();
	}

	@Override
	public void display() {
		System.out.println("Hai");
		
	}

}
