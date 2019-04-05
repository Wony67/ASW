package test0402;

import java.util.Scanner;

public class switchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("점수를 입력하시오");
		int score=s.nextInt();
		String grade="";
		switch(score/10) {
		case 10:
		case 9: grade="A";break;
		case 8: grade="B";break;
		case 7: grade="C";break;
		case 6: grade="D";break;
		default:grade="F";
		}
		System.out.println(grade);
	}

}
