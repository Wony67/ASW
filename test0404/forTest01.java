package test0404;

import java.util.Scanner;

public class forTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		for(int i=0; i<10; i++) {
			System.out.print(i+">>");
			int score=scanner.nextInt();
			sum+=score;
			String grade="";
			if(score>=90)
				grade="A";
			else if(score>=80)
				grade="B";
			else if(score>=70)
				grade="C";
			else if(score>=60)
				grade="D";
			else 
				grade="F";
			System.out.println(score+","+grade);
		}
		System.out.println("average:"+sum/10.0);
	}

}
