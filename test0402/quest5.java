package test0402;

import java.util.Scanner;

public class quest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
				
		if(((a>=b && b>=c) || (a>=c && c>=b)) && a<(b+c))//a
			System.out.print("삼각형이 됩니다");
		else if(((b>=a && a>=c) || (b>=c && c>=a)) && b<(a+c))
			System.out.print("삼각형이 됩니다");
		else if(((c>=a && a>=b) || (c>=b && b>=a)) && c<(b+a))
			System.out.print("삼각형이 됩니다");
		else 
			System.out.print("삼각형이 될 수 없습니다");
			}
	}


