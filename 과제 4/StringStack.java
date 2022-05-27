import java.util.Scanner;  //scanner 사용을 위한 임포트 

// 인터페이스 => 추후에 반드시 구체적인 구현이 이루어져야한다.
interface Stack{
	int length();  //현재 스택에 저장된 개수 리턴 
	int capacity();  // 스택의 전체 저장 가능한 개수 리턴 
	String pop();  // 스택의 톱에 실수 저장 
	boolean push(String val);  // 스택의 톱에 저장된 실수 리턴 
}

// Stack 인터페이스를 상속받아서 구체적인 구현 시작 
class StringStack implements Stack{
	int n = 0;  // 스택에 현재 저장된 값의 개수를 확인하기 위한 변수 (stack pointer 같은 역할을 한다.)
	int max;  // 스택의 최대 저장 공간 
	String arr[];  // 스택 그 자체 

	// length 는 스택에 저장된 개수를 리턴하므로 그냥 n값을 리턴해주면 된다. 
	public int length() {
		return n;
	}
	
	// 저잗 가능한 개수를 리턴하므로 최대 저장 공간에서 현재 저장된 값을 빼면 된다. 
	public int capacity() {
		return max - n;
	}
	
	// 맨끝에있는 원소를 삭제하고 n을 한개 낮춘다.
	public String pop() {
		return arr[--n];
		 
	}
	
	public boolean push(String var) {
		// 수용공간이 없다면 아래 문구를 출력하고 false를 리턴 
		if(capacity() == 0) {
			System.out.println("스택이 꽉 차서 푸시 불가");
			return false;
		}
		
		// 수용공간이 있다면 n위치에 값을 push 하고 n을 한칸 올린다.
		arr[n++] = var;
		return true;

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // scan객체 생성 
		StringStack stack = new StringStack();  //stack객체 생성 
		
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		stack.max = scan.nextInt();  // 스택의 최대 크기를 입력 받음 
		stack.arr = new String[stack.max];  // stack.arr를 만들어 냄 
		
		
		// 무한루프 => 스택의 값을 계속 입력받기 위해서 
		while(true) {
			String s;
			System.out.print("문자열 입력 >>");
			s = scan.next();
			// 입력받은 값이 그만 이라면 루프탈출 
			if(s.equals("그만")) break;
			
			// 입력 받은 값을 계속 푸시 한다. 
			stack.push(s);
		}
		
		// 스택에 저장이 끝나면 모든 문자열을 팝한다.
		System.out.print("스택에 저정된 모든 문자열 팝:");
		for(int i = 0; i<stack.arr.length; i++) {
			System.out.print(stack.pop()+" ");
		}
		scan.close();  //scan 객체를 닫늗다.
	}
}
