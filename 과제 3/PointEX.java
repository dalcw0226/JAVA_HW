package sub_workspace;

class Point3D{
	int x, y, z;
	// x, y, z를 초기화 할 생성자 함수
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// z의 값을 1 올릴 함수
	public void moveUp() {
		z++;
	}

	// z의 값을 1 낮출 함수
	public void moveDown() {
		z--;
	}

	// x와 y의 값을 재 설정할 함수
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드 오버로딩 => x, y, z 모두 재 설정할 함수
	public void move(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// 정해진 형식대로 출력할 함수
	public String toString() {
		return "(" + x + "," + y + "," + z + ")의 점";
	}
}

// main 메소드를 담고 있는 클래스
public class PointEX {
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z 축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(); // z축 1값 증가
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown(); // z축 1값 감소
		p.move(10, 10); // x, y 축의 해당 위치로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300); // x, y, z 축의 해당 위치로 이동
		System.out.println(p.toString() + "입니다.");
	}
}