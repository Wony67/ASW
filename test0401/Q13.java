package test0401;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println();
		
		System.out.print("받은돈 : ");
		int money=s.nextInt();
		System.out.print("상품의 총액 : ");
		int tot=s.nextInt();
		int rate=(int)(tot*0.1);
		System.out.println("부가세 : "+rate);
		System.out.println("잔돈 : "+(money-tot));
	}

}
