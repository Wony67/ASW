import java.util.Scanner;

public class quest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hexa2Bin= {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" 
		};
		Scanner scanner=new Scanner(System.in);
		System.out.print("16진수 문자열 입력>>");
		String hexaStr=scanner.next();
		for(int i=0; i<hexaStr.length(); i++) {
			char c=hexaStr.charAt(i);
			int index=0;
			if(c>='0' && c<='9') index=(c-'0');
			if(c>='a' && c<='f') index=10+(c-'a');
			
			System.out.print(hexa2Bin[index]);
		}
		System.out.println();
	}

}
