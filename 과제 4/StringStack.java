import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}


class StringStack implements Stack{
	int n = 0;
	int max;
	String arr[];

	public int length() {
		return n;
	}
	
	public int capacity() {
		return max - n;
	}
	
	public String pop() {
		return arr[--n];
		 
	}
	
	public boolean push(String var) {
		if(capacity() == 0) {
			System.out.println("스택이 꽉 차서 푸시 불가");
			return false;
		}
		
		arr[n++] = var;
		return true;

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringStack stack = new StringStack();
		
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		stack.max = scan.nextInt();
		stack.arr = new String[stack.max];
		
		while(true) {
			String s;
			System.out.print("문자열 입력 >>");
			s = scan.next();
			if(s.equals("그만")) break;
			
			stack.push(s);
		}
		
		System.out.print("스택에 저정된 모든 문자열 팝:");
		for(int i = 0; i<stack.arr.length; i++) {
			System.out.print(stack.pop()+" ");
		}
		scan.close();
	}
}
