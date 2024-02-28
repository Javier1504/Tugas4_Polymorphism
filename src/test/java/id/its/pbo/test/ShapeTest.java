package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import id.its.pbo.shape.Circle;
import id.its.pbo.shape.Cube;
import id.its.pbo.shape.Shape;
import id.its.pbo.shape.Sphere;
import id.its.pbo.shape.Square;
import id.its.pbo.shape.Tetrahedron;
import id.its.pbo.shape.ThreeDimensionalShape;
import id.its.pbo.shape.Triangle;
import id.its.pbo.shape.TwoDimensionalShape;

class ShapeTest {

Shape[] shapes;
	
	@BeforeEach
	void setUp() throws Exception {
		shapes = new Shape[6];
		
		shapes[0] = new Square(1.0);
		shapes[1] = new Triangle(1.0, 1.0);
		shapes[2] = new Circle(1.0);
		shapes[3] = new Sphere(1.0);
		shapes[4] = new Cube(1.0);
		shapes[5] = new Tetrahedron(1.0);
	}

	@Test
	@DisplayName("Dapat melakukan perhitungan lingkaran")
	void TestCircle() {
		for(Shape item : shapes)
		{
			if(item instanceof TwoDimensionalShape) {
				if(item instanceof Circle) {
					assertEquals(3.14, ((TwoDimensionalShape) item).calculateArea(), 0.01);
				}
				if(item instanceof Square) {
					assertEquals(1, ((TwoDimensionalShape) item).calculateArea());
				}
				if(item instanceof Triangle) {
					assertEquals(0.50, ((TwoDimensionalShape) item).calculateArea());
				}
			
			}else if(item instanceof ThreeDimensionalShape) {
				if(item instanceof Sphere) {
					assertEquals(12.57, ((ThreeDimensionalShape) item).calculateArea(), 0.01);
					assertEquals(4.19, ((ThreeDimensionalShape) item).calculateVolume(), 0.01);
				}
				if(item instanceof Cube) {
					assertEquals(6, ((ThreeDimensionalShape) item).calculateArea(), 0.01);
					assertEquals(1, ((ThreeDimensionalShape) item).calculateVolume(), 0.01);
				}
				if(item instanceof Tetrahedron) {
					assertEquals(1.73, ((ThreeDimensionalShape) item).calculateArea(), 0.01);
					assertEquals(0.12, ((ThreeDimensionalShape) item).calculateVolume(), 0.01);
				}
			}
			
		}

	}

}
