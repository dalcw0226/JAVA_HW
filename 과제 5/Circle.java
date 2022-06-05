package derived;  // package 선언
import base.Shape; // import Shape.class in base package

public class Circle extends Shape {
	// draw Method Overriding
	public void draw() {
		System.out.println("Circle");
	}
}
