package test0402;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num=s.nextInt();
		
		int num1=num/10;
		int num2=num%10;
		if(num1==num2) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		}
			
	}

}
