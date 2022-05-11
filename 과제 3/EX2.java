import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};  //과목설정 
        int score [] = {95, 88, 76, 62, 55};  // 점수 설정 

        while(true){  //무한 루프 생성 
            System.out.print("과목 이름 >> ");
            String name = scan.next();
            if(name.equals("그만")){  // "그만"이라는 값이 들어오면 프로그램 종료 
                break;
            }

            int i;
            int status = 0;  // 상태를 나타내는 변수 지정 1 : 과목이 존재하지 않는 경우/0 : 과목이 존재하는 경
            for(i = 0; i<course.length; i++){
            	// 만약 과목과 입력받은 문자열이 같지 않다면 상태변수를 1로 바꾸고 루프계속돌기  
                if(!(course[i].equals(name))){
                    status = 1;
                    continue;
                }
            	// 만약 과목과 입력받은 문자열이 같다면 상태변수를 0으로 바꾸고 점수 출력  
                if(course[i].equals(name)){
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    status = 0;
                    break;
                }
            }
            // 없는 과목이라면 상태메시지 출력 
            if(status == 1){
                System.out.println("없는 과목 입니다.");
            }
        }
        scan.close();
    }    
}
