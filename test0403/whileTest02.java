package test0403;

import java.util.Scanner;

public class whileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="";
		while(!str.equals("quit")) {
			System.out.println("영문자(a-z 입력, 종료시 quit입력)>>");
			str=s.next();
			char ch=str.charAt(0);
			System.out.println((char)(ch-32));
		}
	}

}
