class Circle{
	// 필드 변수를 선언한다.
	int x;
	int y;
	int radius;
	
	// 생성자 함수를 선언하여 변수들을 초기화 한다. 
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	// object의 equals 메소드를 오버라이딩 하여 중심이 같으면 true를 내뱉도록 한다.
	public boolean equals(Circle b) {
		if(this.x == b.x && this.y == b.y) {
			return true;
		}
		else 
			return false;
	}
	
	// object 객체의 toString Method를 오버라이딩 하여 객체의 레퍼런스변수를 불렀을때
	// 지정한 값이 출력되도록 한다.
	public String toString() {
		return "Circle("+this.x +"," + this.y + ")반지름" + this.radius;
	}
	
}

public class EX1{
	public static void main(String[] args) {
		// 객체를 생성한다.
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		
		// toString 메소드를 동작시킨다.
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		// a와 b의 반지름이 같다면 true가 나와 if문 안 값을 실행시킬 것이다.
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}