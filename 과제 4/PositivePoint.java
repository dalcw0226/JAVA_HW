class Point{
	private int x, y;  //private로 접근지정자를 설정하였으므로 외부 class에서 접근 불가 
	public Point(int x, int y) {this.x= x; this.y = y;}  // 생성자 메소드 
	// x와 y를 가져오는 코드 
	public int getX() {return x;}  // 
	public int getY() {return y;}
	
	// x와 y의 점을 이동시키는 코드 
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

// Point class 를 상속받은 PositivePoint class
public class PositivePoint extends Point {
	// 생성자 메소드 부모클래스의 형식에 맞는 생성자 함수를 찾아가도록 super을 지정 
	public PositivePoint() {
		super(0,0);
	}
	
	// x또는 y가 음수가 나왔을 경우 실행하는 코드 
	public PositivePoint(int x, int y) {
		super(x, y);  // 일반적으로는 부모 클래스의 형식에 맞는 생성자함수를 찾아가도록 한다. 
		// x 또는 y가 0보다 작다면 해당 값은 move메소드를 이용하여 0, 0으로 변경 
		if(getX() < 0 || getY() < 0) {
			super.move(0, 0);
		}
	}
	
	// x와 y가 양수인 경우에만 값을 변경할 수 있도록 한다.
	public void move(int x, int y) {
		if (x > 0 && y > 0){
			super.move(x, y);
		}
	}
	
	// 정형화된 문자열로 출력하도록 한다. 
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 ";
	}
	
	// main 메소드 
	public static void main(String[] args) {
		// 객체 생성 
		PositivePoint p = new PositivePoint();
		// 값을 이동  
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		// 음수로 값을 이동 시킬 경우에는 원래의 값을 유지한다. 
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");

		// 새로운 객체에서 음수로 이루어진 값으로 바꾸려고 한다면 일반 초기 값인 0, 0으로 둔다.
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
