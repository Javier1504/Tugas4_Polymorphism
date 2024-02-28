package id.its.pbo.payroll;

public class PieceWorker extends Employee {
	int hours, wage;
	String firstName, lastName, socialSecurityNumber;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int hours, int wage) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
		this.wage = wage;
	}
	
	public void setWage(int wage) {
		this.wage = wage;
	}
	
	public double earnings() {
		return hours*wage;
	}

}
