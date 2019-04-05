package test0404;

import java.util.Scanner;

public class forTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int cnt=50000;
		for(int i=0; i<10; i++) {
			if(num/cnt>0) {
			System.out.println(cnt+"원권"+":"+num/cnt+"매");
			num%=cnt;
			}
			if(i%2 == 0)
				cnt/=5;
			else
				cnt/=2;
		}
	}
}