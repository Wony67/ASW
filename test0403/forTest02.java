package test0403;

public class forTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println("sum1:"+sum);
		sum=0;
		
		for(int i=100; i>=0; i-=2) {
			sum+=i;
		}
		System.out.println("sum2:"+sum);
	}

}
