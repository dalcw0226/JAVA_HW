package sub_workspace;

class Point{
	private int x, y;

	// 생성자 함수를 받으면서 x 와 y 값을 초기화 한다.
	public Point(int x, int y) {this.x = x; this.y = y;}
	
	// private로 선언된 x와 y값을 빼올 수 있는 함수를 작성한다. 
	public int getX() {return x;}
	public int getY() {return y;}
	
	// x와 y를 변경할 수 있는 메소드를 작성한다.
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

// ColorPoint는 Point 클래스를 상송받는다.
public class ColorPoint extends Point {
	String color;  // color 필드 변수를 선언한다.
	
	// 생성자 오버로딩 시작
	// x와 y값은 super을 이용해서 상위 클래스에서 초기화 한다.
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK"; // 색깔이 입력되지 않았을 시 color는 자동으로 "BLACK"으로 설정한다.
	}
	
	// 매개변수가 1개도 없는 경우/ 디폴트 생성자
	public ColorPoint() {
		// 상위 생성자를 통해 0, 0으로 초기화한다.
		super(0, 0);
		this.color = "BLACK"; // 색깔이 입력되지 않았을 시 color는 자동으로 "BLACK"으로 설정한다.
	}
	
	// setXY 메소드 => x와 y의 값을 다시 맞춘다
	public void setXY(int x, int y) {
		// 상위클래스의 move함수를 이용한다.
		move(x, y);
		this.color = "BLACK";  // 색깔이 입력되지 않았을 시 color는 자동으로 "BLACK"으로 설정한다.
	}
	
	// 색깔을 설정할 수 있는 메소드
	public void setColor(String color) {
		this.color = color;
	}
	
	// 정해진 형식에 맞추어 출력하도록 한다.
	public String toString() {
		return color + "색의 " +"(" + getX() + "," + getY() + ")" + "의 점";
	}
	
	// main method
	public static void main(String[] args) {

		// zeroPoint 객체를 생성한다.
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		// cp 객체를 생성한다.
		ColorPoint cp = new ColorPoint(10,10);
		// 5, 5로 설정
		cp.setXY(5,5);
		// 색깔을 RED로 바꿈
		cp.setColor("RED");
		// toString 메소드를 이용
		System.out.println(cp.toString() + "입니다.");
	}
}
