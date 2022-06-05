import java.util.Vector;  // Vector 컬렉션 import
import java.util.Scanner;  // Scanner.class import

public class EX2 {
	
	public static void main(String[] args) {
		// 객체 생성 
		Scanner scan = new Scanner(System.in);
		// 지시문 
		System.out.print("정수(-1이 입력될 때까지) >> ");
		// Vector 객체 생성 
		Vector<Integer> v = new Vector<Integer>();
		
		// 무한루프 
		while(true) {
			// 값을 계속 받는다.
			int num = scan.nextInt();
			// num이 -1이면 break 
			if(num == -1) break;
			// Vector에 값을 추
			v.add(num);
		}
		
		// 최대값 찾는 알고리즘 수
		int max = 0;
		for(int i = 0; i<v.size(); i++) {
			if(max < v.get(i)) max = v.get(i);
		}
		
		System.out.println("가장 큰 수는 " + max);
		scan.close();
	}	
}
