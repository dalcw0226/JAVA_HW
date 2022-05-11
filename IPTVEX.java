package sub_workspace;
// 여기부터
class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printPorperty() {
		System.out.print(getSize() + "인치 " + color + "컬러");
	}
	
}
// 여기까지는 10번 문제에서 정의한 클래스들이다. 따라서 주석은 생략한다.

// IPTV는 ColorTV를 상속받는다. 고로 TV도 상속받았다고 볼 수 있다.
class IPTV extends ColorTV{
	String ip;  // ip변수를 선언한다.
	
	// 생성자
	public IPTV(String ip, int size, int color){  // 초기화를 위해 3개의 값을 받는다./
		super(size, color);  // 이전의 클래스 (ColorTV)의 생성자를 불러와 값을 초기화 한다.
		this.ip = ip;  // ip의 값은 정상적으로 받는다.
	}
	
	// 출력 형식에 맞추어 출력을 위한 코드
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + color + " 컬러");
	}
}

// main method 를 두기위한 IPTVEX 클래스를 생성한다.
public class IPTVEX {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);  // 객체를 생성하면서 값을 초기화 한다.
		iptv.printProperty();  // iptv 객체의 메소드를 이용하여 출력한다.
	}
}
