package test0402;

import java.util.Scanner;

public class switchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=4;
		System.out.print("연산자 입력");
		Scanner s=new Scanner(System.in);
		String op=s.next();
		
		int result=0;
		switch(op) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
			default:
				System.out.println("연산자가 아님");
		}
		System.out.println(result);
	}

}
