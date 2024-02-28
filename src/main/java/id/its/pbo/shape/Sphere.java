package id.its.pbo.shape;

public class Sphere extends ThreeDimensionalShape{

	double radius;

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return 4 * Math.PI * getRadius() * getRadius();
	}
	
	public double calculateVolume() {
		return (4 * Math.PI * getRadius() * getRadius() * getRadius()) / 3;
	}
}
