// Shape 인터페이스를 구현한다.
interface Shape{
	final double PI = 3.14;  // 상수형태로 PI 변수를 선언한다.
	
	// 아래 함수 2개는 상속을 받은 클래스에서 실 구현이 필요하다.
	void draw();
	double getArea();
	
	// 이 함수는 상속을 하더라도 직접 구현할 필요가 없다.
	default public void redraw() {
		System.out.print("---다시 그립니다.");
		draw();
	}
}

// 상속을 받음 
public class Circle implements Shape {
	
	int radius;
	
	// Circle의 생성자 함수 
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//draw함수 구체화 
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	
	//getArea함수 구체화 
	public double getArea() {
		return PI * radius * radius;
	}
	
	public static void main(String[] args) {
		Shape donut = new Circle(10);  // 객체 생성 
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
