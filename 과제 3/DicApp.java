import java.util.Scanner;

class Dictionary{
	// 한글 배열과 영어 배열을 생성한다.
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i = 0; i < kor.length; i++) {
			// 입력한 단어와 한국어가 같은 경우에는 다음 If문을 수행한다.
			if(kor[i].equals(word)) {
				// w0같은 경우에는 주격조사 '은'으로 처리하고
				// w1같은 경우에는 주격조사 '는'으로 처리한다.
				String[] w0 = {"사랑", "돈", "희망"};
				String[] w1 = {"아기", "미래"};
				// for문 : w0일 경우를 찾기 위함 
				for(String w : w0){
					if(w.equals(kor[i]))
					return "은 " + eng[i];
				}
				// for문 : w1일 경우를 찾기 위함
				for(String w : w1){
					if(w.equals(kor[i]))
					return "는 " + eng[i];
				}
			}
		}
		// 주격 조사를 처리할 방법을 아직까지는 찾을 수 없다.
		return "은(는) 저의 사전에 없습니다.";
	}
}

// 본 클래스
public class DicApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글단어? ");
			String word = scan.next();  //한글단어를 입력받는다.
			
			// "종료"시 프로그램 종료. 
			if(word.equals("종료")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			// Dictionary클래스의 메소드에서 수행한다.
			System.out.println(word + Dictionary.kor2Eng(word));
		}
		scan.close();
	}
}
