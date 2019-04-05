package test04;

import java.util.Scanner;

public class ScannerXEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요");
		Scanner s=new Scanner(System.in);
		
		String name=s.next();
		String city=s.next();
		int age=s.nextInt();
		double weight=s.nextDouble();
		boolean Single=s.hasNextBoolean();
		
	
		System.out.print("이름은"+ name +", "); System.out.print("도시는"+ city +", ");
		System.out.print("나이는"+ age +"살, "); System.out.print("체중은"+ weight +"kg, ");
		System.out.print("독신 여부는"+ Single +"입니다.");
		 
		s.close();
		 
	}
}