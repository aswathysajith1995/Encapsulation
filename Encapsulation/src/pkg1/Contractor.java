package pkg1;

public class Contractor extends Employee {
private int workingHour;
	public Contractor(String name, int paymentPerHour,int workingHour) {
		super(name, paymentPerHour);
		this.workingHour=workingHour;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return getPaymentPerHour()*workingHour;
	}

}
