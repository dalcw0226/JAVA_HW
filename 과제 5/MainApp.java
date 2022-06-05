package main;  // package 선언 
import etc.Calc;  // etc의 package의 Calc.class import


public class MainApp {

	public static void main(String[] args) {
		// import 해온 객체 생성 
		Calc c = new Calc(10, 20);
		// 출
		System.out.println(c.sum());
	}

}
