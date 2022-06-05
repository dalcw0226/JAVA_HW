import java.util.Scanner;  // Scanner 객체 생성 
import java.util.ArrayList;  // ArrayList 임포트 

public class EX3 {
	public static void main(String[] args) {
		// Scanner 객체 생성 
		Scanner scan = new Scanner(System.in);
		// ArrayList 생성 
		ArrayList<Character> score = new ArrayList<Character>();
		// 값을 매칭하기 위한 배열 2개 생성 => 약간 python dictionary 같은 느낌을 구현하기 위해 
		char grade_table[] = {'A', 'B', 'C', 'D', 'F'};
		double match_grade[] = {4.0, 3.0, 2.0, 1.0, 0};
 		
		// 지시문 
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for(int i = 0; i<6; i++) {
			// 6개의 값을 문자로 받는다. 사실 문자열로 받으면 더 쉬웠을 듯 
			char grade = scan.next().charAt(0);
			// ArrayList에 추가 
			score.add(grade);
		}
		//평균을 내기위한 변수 선언 
		double sum = 0;
		
		// 학점과 점수를 매칭해서 sum에 누적한다. 
		for(int i = 0; i<6; i++) {
			for(int j = 0; j<5; j++) {
				if(grade_table[j] == score.get(i)) { sum += match_grade[j];}
			}
		}
		// 평균을 구한다.
		double avg = sum / 6;
		// 출력한다.
		System.out.println(avg);
		scan.close();
	}
}
