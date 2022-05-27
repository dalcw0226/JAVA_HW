package sub_package;

// 이전 문제에서 사용한 Shape 인터 페이스이다.
interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다.");
		draw();
	}
}


// Circle class가 Shape interface를 상속 받는다.
// 이전 문제와 동일하다.
class Circle implements Shape {
	
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
}

// Oval	class에 Shape interface를 상속받는다.
// 사실 안의 내용은 잘 출력되도록 맞춰서 작성해 주면 되므로 Circle class 를 작성하는 것과 동일 하게 생각해도 될 것 같다.
class Oval implements Shape{
	int x, y;
	
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//draw함수 구체화 
	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
	}
	
	//getArea함수 구체화 
	public double getArea() {
		return PI * x * y;
	}
	
}

// Rect class 도 Shape interface를 상속받아 잘 구현해 준다.
class Rect implements Shape{
	int x, y;
	
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//draw함수 구체화 
	public void draw() {
		System.out.println(x + "x" + y + " 크기의 사각형 입니다.");
	}
	
	//getArea함수 구체화 
	public double getArea() {
		return x * y;
	}
}


public class EX5 {
	public static void main(String[] args) {
		// 객체 레퍼런스 배열을 만든다.
		// 그리고 한개씩 참조를 하면서 객체를 생성해 준다.
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		// 객체에 맞는 값들을 출력시킨다.
		for(int i = 0; i<list.length; i++) list[i].redraw();
		for(int i = 0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}
