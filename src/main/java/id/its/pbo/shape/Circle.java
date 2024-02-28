package id.its.pbo.shape;

public class Circle extends TwoDimensionalShape{

	double jari;

	public Circle(double jari) {
		super();
		this.jari = jari;
	}

	public double getRadius() {
		return jari;
	}

	public void setRadius(double jari) {
		this.jari = jari;
	}
	
	public double calculateArea() {
		return getRadius() * getRadius() * Math.PI;
	}
	
}
