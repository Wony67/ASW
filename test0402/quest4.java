package test0402;

import java.util.Scanner;

public class quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int mid;
		
		if((a>b && a<c) || (a>c && a<b)) {
			mid=a;
		}
		else if((a<b && b<c) || (c<b && b<a)){
			mid=b;
		}
		else {
			mid=c;
		}
		System.out.println("중간 값은 "+ mid);
	}

}
