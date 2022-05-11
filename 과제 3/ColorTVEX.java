/*package sub_workspace;
// default 클래스는 내부 클래스에서는 충분히 접근 가능하다.
class TV{
	private int size;  // private로 정의된 필드변수를 선언
	public TV(int size) {this.size = size;}  // 생성자 : size를 초기화한다.
	protected int getSize() {return size;}  // private로 선언된 변수는 외부 클래스에서 접근이 불가능 하므로 외부로 변수를 빼주는 역할을 한다.
}

// 문제에서 제시한 ColorTV 클래스를 정의 => TV클래스를 상속받는다.
class ColorTV extends TV{
	// color 변수 선언
	int color;
	
	// 생성자 함수
	public ColorTV(int size, int color) {
		super(size);  // size변수에 직접 접근을 할 수 없으므로 super을 이용하여 상위 생성자 함수에 size값을 집어 넣고 변수에 대입한다.
		this.color = color;  // color는 정상적으로 받는다.
	}
	
	//printProperty 메소드를 생성한다.
	public void printProperty() {
		System.out.print(getSize() + "인치 " + color + "컬러");
	}
	
}

// 결과를 출력할 ColorTVEX 클래스를 생성한다.
public class ColorTVEX {

	// main method
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);  // 생성자 함수에 초기화할 값을 집어 넣어준다.
		myTV.printProperty();  //myTV 객체에 printProperty 메소드를 이용.
	}
}*/
