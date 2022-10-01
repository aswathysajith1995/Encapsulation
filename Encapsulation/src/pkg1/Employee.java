package pkg1;

public abstract class Employee {
	private String name;
	private int paymentPerHour;
	public abstract int calculateSalary();
	public Employee(String name,int paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

}
