package test04;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="홍길동";
		int age=10;
		double weight=50;
		double height=165;
		System.out.println("이름은"+name+" 나이는"+age+" 몸무게는"+weight+" 키는"+height+" 입니다.");
		System.out.printf("이름은%s이고 나이는 %d이고 몸무게는 %f, 키는 %f입니다", name, age, weight, height);
		//위 두 줄은 같은 결과값을 가진다. 여러 종류의 변수값을 차례대로 넣고 싶을 때는 printf를 사용하면 편하다.
		System.out.println();
		
		System.out.print(10);//10을 프린트 하라
		System.out.println();//줄바꿈을 하라(내용 없음)
		System.out.println(10);//위 두줄 조합
		System.out.println("a+b="+10);//'a+b='이라는 문자열과 10을 한 덩어리로 만들어 출력하라.
		
		System.out.printf("%d, %d\n", 10,20);		
		System.out.printf("%5.3f, %s\n", 3.5,"abc");		
		System.out.printf("%c\n", 'A');
		//%5.3f = 소수를 표현하는데 자리수는 최대 5개, 소수점 아래 3개만 사용하겠다.
		//%는 인용부호 - %뒤의 알파벳은 출력될 값의 형태를 말해준다.
		//%다음에 들어가는'\n'은 줄바꿈을 의미한다.
						
		System.out.printf("10+5=%d\n",10+5);
		System.out.println("10+5="+(10+5));
		//둘다 같은 결과값을 낼 수 있다. printf 와 println중 편한 것을 골라 쓰면 된다.
		
//		System.out.println(10,20); <- error = 프린트는 한 덩어리의 문자(혹은 숫자)열만을 출력할 수 있다.
		
		
		/*
		 * Scanner scanner=new Scanner(System.in); for(int i=0; i<10; i++) {
		 * System.out.println("영문자 입력"); String str=scanner.next(); char
		 * ch=str.charAt(0); System.out.println(i+":"+(char)(ch-32)); }
		 */
	}
}
