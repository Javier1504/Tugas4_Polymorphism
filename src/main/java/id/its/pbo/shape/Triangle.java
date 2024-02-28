package id.its.pbo.shape;

public class Triangle extends TwoDimensionalShape{

	private double alas, tinggi;

	public Triangle(double alas, double tinggi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
	}

	public double getBase() {
		return alas;
	}

	public void setBase(double alas) {
		this.alas = alas;
	}

	public double getHeight() {
		return tinggi;
	}

	public void setHeight(double tinggi) {
		this.tinggi = tinggi;
	}
	
	public double calculateArea() {
		return getBase() * getHeight() * 0.5;
	}
}