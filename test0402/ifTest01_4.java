package test0402;

import java.util.Scanner;

public class ifTest01_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=4;
		
		Scanner s=new Scanner(System.in);
		System.out.print("연산자를 정해주세요");
		String op = s.next();
		char op1=op.charAt(0);
		
		if(op1=='+') {
			System.out.println(num1+num2);
		}else if(op1=='-') {
			System.out.println(num1-num2);
		}else if(op1=='*') {
			System.out.println(num1*num2);
		}else if(op1=='/') {
			System.out.println(num1/num2);
		}else if(op1=='%') {
			System.out.println(num1%num2);
		}else {
			System.out.println("연산자가 아님");
		}
		
	}
}
