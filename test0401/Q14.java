package test0401;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("마일을 입력하시오 : ");
		int mile=s.nextInt();
		
		double km=mile*1.609;
		System.out.println(mile+"마일은"+km+"킬로미터 입니다.");
	}

}
