package id.its.pbo.payroll;

public class HourlyEmployee extends Employee{
	int hours; 
	double wage;
	String firstName, lastName, socialSecurityNumber;
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hours) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
			
		if(wage>=0) this.wage = wage;
		else this.wage = 0.0;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public double earnings() {
		if(hours<=40) return hours*wage;
		else return 40.0*wage + (wage*(hours-40.0))*1.5;
	}
}