
import java.util.Scanner;

public class Grade {
	// 3개의 변수를 private로 선언 
	// private로 선언된다면 class내에서는 충분히 접근 가능하다.
    private int math;
    private int science;
    private int english;

    // 생성자를 이용해서 필드변수를 초기화 한다.
    // 이때, this를 이용해서 필드변수임을 지정한다. 
    public Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }
    
    //average 메소드를 생성한다.
    //평균을 계산한 후 정수형으로 리턴한다.
    public int average(){
        int sum = math + science + english;
        // 정수 / 정수 = 정수가 나온다.
        return sum / 3;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // 객체를 생성한다.
        System.out.print("수학, 과학, 영어순으로 3개의 점수 입력>>");  // 지시 

        // 값을 입력받는다.
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        
        // 객체를 생성하면서 생성자 함수를 불러온다.
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());
        // average()는 평균을 계산하여 리턴
        scanner.close();
    }
}
