package app;  // package declare
import derived.Circle;  // import Circle.class in derived
import base.Shape;  // import Shape.class in base

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle(); // UpCasting
		shape.draw(); // print Circle
	}
}
