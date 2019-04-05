package test0402;

import java.util.Scanner;

public class quest4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int median=a; //초기값은 왜 쓰는건가?
		if((a>b && a<c) || (a>c && a<b))
			median=a;
		else if((b>a && b<c) || (b>c && b<c))
			median=b;
		else
			median=c;
		System.out.println(median);
	}

}
