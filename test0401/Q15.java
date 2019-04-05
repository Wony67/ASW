package test0401;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("정수:");
		int num=s.nextInt();
		String str=""+num%2;
		num=num/2;
		str=num%2+str;
		num=num/2;
		str=num%2+str;
		System.out.println(str);
		
	}

}
