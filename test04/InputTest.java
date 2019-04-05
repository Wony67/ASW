package test04;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		new Scanner(System.in) - 스캐너라는 객체(?)를 만들어라.
//		System.out.print("이름:");
//		String name=s.next();
//		System.out.print("나이:");
//		int age=s.nextInt();
//		System.out.print("몸무게:");
//		double weight=s.nextDouble();
		
		System.out.println("문자열 입력");
		String str=s.next();
		System.out.println(str);
		s.close(); //스캐너를 닫는다. (닫지 않으면 계속 스캐너 명령값을 기다리고 있기 때문에 's'에 알람이 떠 있게 된다.)
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(weight);
	}
}
