package test0404p;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요>>");
		int num=scanner.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=i; j<num; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}
		scanner.close();
	}

}
