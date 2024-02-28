package id.its.pbo.payroll;

public class CommissionEmployee extends Employee{
	String firstName, lastName, socialSecurityNumber;
	double grossSales, commissionRate;
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public CommissionEmployee() {
		
	}
	
	public double earnings() {
		return grossSales*commissionRate;
	}
}