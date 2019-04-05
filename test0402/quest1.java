package test0402;

import java.util.Scanner;

public class quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("원화를 입력하세요");
		double num=s.nextDouble();
		double d=num/1100;
		
		System.out.println(num+"원은 $"+d+"입니다");
	}
	
}
