package pkg1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee contractor = new Contractor("contractor", 10, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
	}

}
