package test0403;

import java.util.Scanner;

public class doWhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String str="";
		
		do {
			System.out.print("영문자(a-z 입력, 종료시 quit입력)>>");
			str=s.next();
			char ch=str.charAt(0);
			System.out.println((char)(ch-32));
		}while(!str.contentEquals("quit"));
	}

}
