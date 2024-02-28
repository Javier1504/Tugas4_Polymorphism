package id.its.pbo.shape;

public class Tetrahedron extends ThreeDimensionalShape{
	
	private double side;

	public Tetrahedron(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getHeight(double side) {
		double base = getSide() / 2;
		double akar = Math.pow(getSide(), 2) - Math.pow(base, 2);
		
		return Math.sqrt(akar);
	}

	public double calculateArea() {
		return 4 * (getSide() * getHeight(getSide()) / 2);
	}
	
	public double calculateVolume() {
		return Math.pow(getSide(), 3) / (6 * Math.sqrt(2));
		
	}
	
}