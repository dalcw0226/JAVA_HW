class ArrayUtil{
	// concat 함수를 만들자
	public static int[] concat(int[] a, int[] b) {
		// 일단 배열을 만들어야 하는데 배열의 길이는 a의 길이와 b의 길이를 합친 크기가된다.
		int array[] = new int[a.length + b.length];
		// 첫번째 for 루프에서는 a를 순차적으로 새로 만든 배열에 대입한다.
		for(int i = 0; i<a.length; i++) {
			array[i] = a[i];
		}
		// 두번째 for 루프에서는 순서가 중요한데 일단 a루프의 끝의 원소로부터 i의 값을 더해나가면
		// array 배열안에는 a루프와 b루프가 합쳐진다.
		for(int i = 0; i<b.length; i++) {
			array[a.length+i] = b[i];
		}
		// array의 주소값을 리턴한다.
		return array;
	}
	
	// 배열을 출력하는 함수
	public static void print(int[] a) {
		System.out.print("[");
		// 그냥 a의 길이만큼 잘 출력하면된다.
		for(int i = 0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.print("]");
	}
}

// 본 클래스
public class StaticEx {

	public static void main(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};

		// concat함수를 이용해서 array1과 array2가 합쳐진 배열을 array3에 저장한다.
		int[] array3 = ArrayUtil.concat(array1, array2);

		// 정의한 print함수를 통해 출력
		ArrayUtil.print(array3);
	}
}
