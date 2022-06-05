package etc;  // 패키지 선언 

// 외부에서 접근할 예정이므로 public 접근지정자를 선언한다. 
public class Calc {

	// 필드 변수 선언 
	private int x, y;
	// 필드변수 초기화 
	public Calc(int x, int y) {this.x = x; this.y = y;}
	// 덧셈연산 수행 
	public int sum() {return x + y;}
}
