package exam03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력해주세요>>");
		String str=scanner.next();
		char ch=str.charAt(0);
		int r=ch-'a';
		
		for(int i=r; i>=0; i--) {
			for(char ch1='a'; ch1<='a'+i; ch1++) {
				System.out.print(ch1+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
