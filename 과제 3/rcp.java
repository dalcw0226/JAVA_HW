import java.util.Scanner;

public class rcp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scan 객체 생성
		String str[] = {"가위", "바위", "보"};  // 가위 바위 보를 담고 있는 배열 생성
				
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true){
            int n = (int)(Math.random()*3);  // 컴퓨터가 낸 값을 지정하기 위해 랜덤 값 입력

            String user;  // 사용자의 값을 받기 위한 변수
            System.out.print("가위 바위 보!>> ");
            user = scan.next();

            if(user.equals("그만")){  // 그만이 입력되면 게임 종료
                System.out.println("게임을 종료합니다.");
                break;
            }

            if(user.equals("가위")){
                // 가위 바위 보의 논리에 맞도록 if문을 써준다.
                if(str[n].equals("가위")){  // 사용자가 낸 값이 가위인 경우
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 비겼습니다." );
                }
                if(str[n].equals("바위")){
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 컴퓨터가 이겼습니다." );
                }
                if(str[n].equals("보")){
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 사용자가 이겼습니다." );
                }
            }
            if(user.equals("바위")){
                // 가위 바위 보의 논리에 맞도록 if문을 써준다.
                if(str[n].equals("가위")){  // 사용자가 낸 값이 바위인 경우
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 사용자가 이겼습니다." );
                }
                if(str[n].equals("바위")){
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 비겼습니다." );
                }
                if(str[n].equals("보")){
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 컴퓨터가 이겼습니다." );
                }
            }
            if(user.equals("보")){
                // 가위 바위 보의 논리에 맞도록 if문을 써준다.
                if(str[n].equals("가위")){  // 사용자가 낸 값이 가위인 경우
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 컴퓨터가 이겼습니다." );
                }
                if(str[n].equals("바위")){
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 사용자가 이겼습니다." );
                }
                if(str[n].equals("보")){
                    System.out.println("사용자 = " + user + " , 컴퓨터  " + str[n] + ", 비겼습니다." );
                }
            }
        }
	}
}