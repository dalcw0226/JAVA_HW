import java.util.InputMismatchException; // 예외처리를 위한 import
import java.util.Scanner;

class Multiply{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("곱하고자 하는 두수 입력>>");
            // 실수가 아닌 정수값으로 잘 입력했을때 작동하는 코드
            try{
                int n = scan.nextInt();
                int m = scan.nextInt();
                System.out.println(n + "x" + m + " = " + n*m);  // 실제 연산을 위한 코드
                scan.close();
                break;  // 무한루프를 탈출한다.
            }
            // try문에서 예외가 발생한 경우 작동하는 코드 
            catch(InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                scan.nextLine();  // 무한루프를 만들지 않고 빠져나가기 위해 사용하는 코드
                continue;
            }
        }
    }
}