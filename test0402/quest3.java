package test0402;

import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		
		int num=s.nextInt();
		
		if(num>=50000) {
			System.out.println("오만원권 "+num/50000+"매");
			}
		else {
			System.out.print("");
		}
		num=num%50000;
		if(num>=10000) {
			System.out.println("만원권 "+num/10000+"매");
			}
		else {
			System.out.print("");
		}
		num=num%10000;
		if(num>=5000) {
			System.out.println("오천원권 "+num/5000+"매");
			}
		else {
			System.out.print("");
		}
		num%=5000;
		if(num>=1000) {
			System.out.println("천원권 "+num/000+"매");
			}
		else {
			System.out.print("");
		}
		num%=1000;
		if(num>=500) {
			System.out.println("오백원권 "+num/500+"개");
			}
		else {
			System.out.print("");
		}
		num%=500;
		if(num>=100) {
			System.out.println("백원권 "+num/100+"개");
			}
		else {
			System.out.print("");
		}
		num%=100;
		if(num>=50) {
			System.out.println("오십원권 "+num/50+"개");
			}
		else {
			System.out.print("");
		}
		num%=50;
		if(num>=10) {
			System.out.println("십원권 "+num/10+"개");
			}
		else {
			System.out.print("");
		}
		num%=10;
		if(num>0) {
			System.out.println("일원권 "+num+"개");
			}
		else {
			System.out.print("");
		}
		}
}
