package test0404p;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하세요>>");

		char c=scanner.next().charAt(0);
		int num = c-96;
		
		for(int i=1; i<=num;) {
			for(int j=i; j<=num; j++) {
				if(j>=i)
					System.out.print((char)(j+96)+" ");
				else
					System.out.print(" ");
			}
			num-=1;
			System.out.println();
		}
		scanner.close();
	}
}


//1~26 + 96 = 아스키코드 a~z
//아스키코드 97~122 = a~z