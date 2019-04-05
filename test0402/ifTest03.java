package test0402;

public class ifTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=25, max=0;
		
		if(a>b) {
			if(a>c) {
				max=a;
			}else {
				max=c;
			}
		}else {
			if(b>c) {
				max=b;
			}else {
				max=c;
			}
		}
		System.out.println(max);
	}
}
