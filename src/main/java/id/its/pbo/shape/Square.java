package id.its.pbo.shape;

public class Square extends TwoDimensionalShape{

	double sisi;

	public Square(double sisi) {
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
		return getSide() * getSide();
	}
	
}