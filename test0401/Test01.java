package test0401;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=4;
		int c=0;
		
		int max=a>b?a:b;
		// a가 b보다 큰가? 만약 참이라면 (a:b) a값을 리턴, 거짓이라면 b값을 리턴.
		System.out.println("max="+max);
		
		boolean b1=a==b;
		boolean b2=a>b;
		
		System.out.println(a+=5);//a=a+5
		System.out.println(a-=5);
		System.out.println(a*=5);
		System.out.println(a/=5);
		System.out.println(a%=5);
		System.out.println();
		// 위 연산자를 사용할 경우 a값에 해당 연산후 값을 대입하게 된다. 
		// 때문에 차례대로 내려오며 연산이 처리 된다.
		
		
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println(b1 ^ b2);
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		
		System.out.println();
		
		System.out.println(a<<3); //2의 n승을 곱해준다. 2진수로 봤을 때 왼쪽으로 숫자를 3칸 밀어준다.
		System.out.println(a>>2); //2의 n승을 나눠준다. 2진수로 봤을 때 오른쪽으로 숫자를 2칸 밀어준다.
		System.out.println();
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		
		
		c=a++;//a=a+1
		System.out.println("a=" +a+", c=" +c);
		c=a--;//a=a-1;
		System.out.println("a="+a+", c="+c);
		System.out.println(++a); //a=a+1;
		System.out.println(--a); //a=a-1;
		
		b=a++;
		c=a--;
		
		
	}

}
