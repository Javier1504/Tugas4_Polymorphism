package id.its.pbo.payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}	

	public double earnings() {
		return super.earnings() + baseSalary;
	}
}