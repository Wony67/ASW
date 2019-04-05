package test0402;

import java.util.Scanner;

public class ifTest01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("점수 입력:");
		int num=s.nextInt();
		String grade="";
		if(num>=90) {
			grade="A";
		}else if(num>=80){
			grade="B";
		}else if(num>=70){
			grade="C";
		}else {
			grade="F";
		}
	
		
		System.out.println("grade:"+grade);
		System.out.println("끝");
	}
}




