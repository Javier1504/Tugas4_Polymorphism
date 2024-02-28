package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import id.its.pbo.payroll.BasePlusCommissionEmployee;
import id.its.pbo.payroll.CommissionEmployee;
import id.its.pbo.payroll.HourlyEmployee;
import id.its.pbo.payroll.PieceWorker;

class PayrollTest {
	CommissionEmployee comemployee;
	BasePlusCommissionEmployee basecomemployee;
	HourlyEmployee hourlyemployee1;
	HourlyEmployee hourlyemployee2;
	PieceWorker pieceworker;
	
	@BeforeEach
	void setUp() throws Exception {
		comemployee = new CommissionEmployee("Elshe", "Angely", "1", 127.5, 0.05);
		basecomemployee = new BasePlusCommissionEmployee("Elshe", "Angely", "101", 115.5, 0.08, 120);
		hourlyemployee1 = new HourlyEmployee("Elshe", "Angely", "101", 45.5, 16);
		hourlyemployee2 = new HourlyEmployee("Elshe", "Angely", "103", 48.3, 145);
		pieceworker = new PieceWorker("Elshe", "Angely", "101", 32, 3);
	}

	@Test
	@DisplayName("Mendapatkan nilai gaji commission employee")
	void testComEmployeeEarnings() {
		assertEquals(6.375, comemployee.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai gaji commission employee dengan base")
	void testBaseSalary() {
		assertEquals(129.24, basecomemployee.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai gaji jam kurang dari 40")
	void testEarningLessThan40Hours() {
		assertEquals(728.0, hourlyemployee1.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai gaji jam lebih dari 40")
	void testEarningMoreThan40Hours() {
		assertEquals(9539.25, hourlyemployee2.earnings());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai gaji pieceworker")
	void testPieces() {
		assertEquals(96.0, pieceworker.earnings());
	}
	
}
