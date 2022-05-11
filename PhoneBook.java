import java.util.Scanner;

class Phone{
    // Phone 클래스의 필드 변수
    private String name;
    private String tel;

    // Phone 클래스의 생성자
    public Phone(String name, String tel){
        // 매개변수와 필드 변수를 구별하기 위해서 this를 사용한다.ㅣ
        this.name = name;
        this.tel = tel;
    }

    // private로 선언된 경우 같은 클래스가 아니라면 정보를 빼올 수 없다.
    // 따라서 같은 클래스에서 메소드를 선언하여 리턴하는 형식으로 빼와야 한다.
    public String getName(){
        return name;
    }

    public String getTel(){
        return tel;
    }
}

// 본 클래스
class PhoneBook{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // 인원수 입력받기
        System.out.print("인원수 >> ");
        // 숫자 입력받기
        int num = scan.nextInt();

        // Phone 클래스의 객체를 배열로 생성한다.
        // 배열의 개수는 입력받은 숫자만큼으로 지정한다.
        Phone[] persons = new Phone[num];

        // 입력받은 인원 수 많큼 for 루프를 돈다.
        for(int i = 0; i < num; i++){
            System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>>>");
            // name, tel의 값을 입력받는다.
            String name = scan.next();
            String tel = scan.next();

            // 객체 배열안에 한개한개의 값들을 생성함과 동시에 생성자 함수의 form에 맞추어 주어, 객체의 변수들을 바로 초기화한다.
            persons[i] = new Phone(name, tel);
        }

        // 모두 입력받고 나면 저장완료 문구를 출력한다.
        System.out.println("저장되었습니다...");


        // 이제부턴 검색단계
        while(true){
            System.out.print("검색할 이름>>");
            String name = scan.next();

            // "그만" 이라는 문자열이 들어온다면 무한루프를 탈출하고 프로그램을 종료한다.
            if("그만".equals(name)){
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            // 인원수 만큼 for루프를 돌면서 입력받은 이름의 사람이 실제로 존재하는지 확인한다.
            for(int i = 0; i < num; i++){
                if(persons[i].getName().equals(name)){
                    // 만약 있다면 이름과 번호를 출력형식에 맞추어 출력한다.
                    System.out.println(name + "의 번호는 " + persons[i].getTel() + " 입니다.");
                    break;
                }
                // 마지막까지 사람이 나타나지 않는다면, 없음을 알리는 문구를 띄운다.
                if(i == num-1){
                    System.out.println(name + "이(가) 없습니다.");
                }
            }
        }
    }
}