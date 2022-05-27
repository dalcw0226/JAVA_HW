// 추상클래스 PariMap 만들기 
abstract class PariMap{
	
	//protected 접근 지정자로 배열 래퍼런스 변수 생성 
	//protected 이므로 상속관계에서만 가능 
	protected String keyArray[];
	protected String valueArray[];
	
	// 추상클래스들이므로 상속받은 클래스에서 재 구현 필요 
	abstract String get(String key);  //key값을 가진 value를 리턴, 없으면 null리턴 
	abstract void put(String key, String value);  // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정 
	abstract String delete(String key);  // key값을 가진 아이템(value와 함께) 삭제. 삭제된 값 리턴 
	abstract int length();  // 현재 저장된 아이템의 개수 리턴 
}


// 추상클래스를 상속받은 Dictionary 클래스 
class Dictionary extends PariMap{
	
	//dicSize와 sp(stackpoint)를 지정해준다, 변수는 초기화를 하지 않으면 에러가 발생하므로 초기화를 해준다.
	int dicSize = 0;
	int sp = 0;
	
	// 생성자 함수 
	public Dictionary(int dicSize) {
		this.dicSize = dicSize;
		//dicSize에 맞춰서 keyArray배열과 valueArray배열을 생성해 준다. 
		keyArray = new String[dicSize];
		valueArray = new String[dicSize];
	}
	
	// get 함수를 구현한다.
	String get(String key) {
		// null래페런스를 참조하려고 하면 Excetion이 발생하므로 예외처리를 통해 해결한다.
		try {
			// 접근 가능한 원소가 들어가 있는 경우에는 정상적으로 접근한다.
			for(int i = 0; i<dicSize; i++) {
				// key값을 찾으면 반환한다. 
				if(keyArray[i].equals(key)) {
					return valueArray[i];
				}
			}
		}
		// null 래퍼런스에 접근하려고 하면 어차피 key값을 못찾은것이므로 null을리턴한다. 
		catch (NullPointerException e){
			return "null";
		}
		
		// 어차피 실행은 안될 코드이지만 써주지 않으면 에러가 발생하니까 작성해준다.
		return "";
	}
	
	// key 와 value를 저장하는 함
	void put(String key, String value) {
		// 그냥 막 저장하기 전에 keyArray값에 내가 입력하려고 하는 값이 있는지 확인한다.
		// 만약 값이 있다면 해당 자리의 value를 대체한다.
		for(int i = 0; i<sp; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				// return 값이 void 이기는 하지만 함수를 종료시키고 싶다면 사용할 수 있다.
				return;
			}
		}
		// keyArray에 key를 집어 넣는다.
		keyArray[sp] = key;
		// valueArray에 값을 집어 넣고 stack point 를 1 증가 시킨다.
		valueArray[sp++] = value;
	}
	
	// 삭제하는 과정 
	String delete(String key) {
		int i = 0;
		// 일단 값이 있는지 부터 확인한다.
		String returnValue = null;
		for(int j = 0; j<sp; j++) {
			if(keyArray[j].equals(key)){
				// 찾은 값을 i에 저장한다.
				i = j;
				returnValue = keyArray[j];
				break;
			}
		}
		// subKeyArray와 subValueArray를 만들어 값을 임시 저장해둔다.
		String subKeyArray[] = new String[dicSize];
		String subValueArray[] = new String[dicSize];
		// 삭제할 값을 뺀 후 배열을 다시 정의한다.
		for(int j = 0; j<i; j++) {
			subKeyArray[j] = keyArray[j];
			subValueArray[j] = valueArray[j];
		}

		for(int j = i, k = i+1; k < dicSize; j++) {
			subKeyArray[j] = keyArray[k];
			subValueArray[j] = keyArray[k];
			k++;
		}
		
		// 완성된 subKeyArray와 완성된 subValueArray를 원래의 래퍼런스 변수에 대입한다.
		keyArray = subKeyArray;
		valueArray = subValueArray;
		// stack point 를 한개 줄인다.
		sp--;
		return returnValue;
	}
	
	// 길이를 체크하는 함수 = 스택포인터가 현재 스택에 쌓여있는 값의 개수이다.
	int length() {
		return sp;
	}
	
}


public class DictionaryApp {

	public static void main(String[] args) {
		// 딕셔너리의 크기를 10개로 잡는다.
		Dictionary dic = new Dictionary(10);
		// 딕셔너리에 값을 한개씩 집어 넣는다.
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		// 이미 값이 있는 경우 체크를 한 후 교체한다.
		dic.put("이재문", "C++");
		
		// 값을 출력한다.
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		// 삭제하는 함수. 
		dic.delete("황기태");
		// 삭제를 한 값에 대해서는 null이 들어 있다.
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		
	}
}

