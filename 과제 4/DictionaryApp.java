

abstract class PariMap{
	
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PariMap{
	
	int dicSize = 0;
	int sp = 0;
	
	public Dictionary(int dicSize) {
		this.dicSize = dicSize;
		keyArray = new String[dicSize];
		valueArray = new String[dicSize];
	}
	
	String get(String key) {
		try {
				for(int i = 0; i<dicSize; i++) {
					if(keyArray[i].equals(key)) {
						return valueArray[i];
					}
				}
			}
		catch (NullPointerException e){
			return "null";
		}
		return "";
	}
	
	void put(String key, String value) {
		for(int i = 0; i<dicSize; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				return;
			}
		}
		keyArray[sp] = key;
		valueArray[sp++] = value;
	}
	
	String delete(String key) {
		int i = 0;
		String returnValue = null;
		for(int j = 0; j<dicSize; j++) {
			if(keyArray[j].equals(key)){
				i = j;
				returnValue = keyArray[j];
				break;
			}
		}
		
		String subKeyArray[] = new String[dicSize];
		String subValueArray[] = new String[dicSize];
		for(int j = 0; j<i; j++) {
			subKeyArray[j] = keyArray[j];
			subValueArray[j] = valueArray[j];
		}

		for(int j = i, k = i+1; k < dicSize; j++) {
			subKeyArray[j] = keyArray[k];
			subValueArray[j] = keyArray[k];
			k++;
		}
		
		keyArray = subKeyArray;
		valueArray = subValueArray;
		sp--;
		return returnValue;
	}
	
	int length() {
		return sp;
	}
	
}


public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		
	}
}

