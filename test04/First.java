package test04;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int i=b;
		b=(byte) i;
		float f=i;
		i=(int) f;
		int ii=128;
		b=(byte)ii;
		System.out.println(ii+","+b);
		double d=3.14*10;
		
		byte bb1=(byte)(b+10);
		//byte bb1=b+10;
		//위 식을 사용할 경우 10을 정수(int)로 인식하기 때문에 에러가 발생한다.
		
		System.out.println((char)ii);
	
	}

}
