package id.its.pbo.shape;

public class Cube extends ThreeDimensionalShape{

	double sisi;

	public Cube(double sisi) {
		super();
		this.sisi = sisi;
	}

	public double getSide() {
		return sisi;
	}

	public void setSide(double sisi) {
		this.sisi = sisi;
	}
	
	public double calculateArea() {
		return 6 * getSide() * getSide();
	}
	
	public double calculateVolume() {
		return getSide() * getSide() * getSide();
	}
	
}
