// 문제 1
public class Average {
    public static void main(String[] args){  // args에 이클립스 설정을 통해 초기값을 지정해 줄 예정.
        int sum = 0;  // 누적 계산값을 넣을 변수 선언 
        for(int i = 0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);  // 값이 String 형태이므로 정수형 변환 작업실행 
        }

        System.out.print("입력받은 인자 값의 평균은 : " + (double)sum/args.length); // 출력형식에 맞추어 평균값 출력. 
    }
}
