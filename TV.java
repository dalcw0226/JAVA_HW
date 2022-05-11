public class TV {
	//필드변수를 생성하기 
    String TV_name;
    int year;
    int size;
    
    // 생성자 함수를 정의해 주기 
    public TV(String TV_name, int year, int size){
    	// 필드변수와 매개변수의 이름이 같으므로 this연산자를 이용하여 구별해주기 
        this.TV_name = TV_name;
        this.year = year;
        this.size = size;
    }

    //주어진 조건에 맞추어 출력하는 메소드 
    public void show(){
        System.out.print(TV_name + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }

    //main method
    public static void main(String[] args){
        TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치 
        myTV.show();
    }   
}
