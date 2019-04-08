
public class mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num= {1.0, 2.0, 3.0, 4.0};
		double sum=0.0;
		
		for(int i=0; i<num.length; i++) {
		System.out.print(num[i]+" ");
		sum += num[i];
		}
		System.out.println();
		System.out.println(sum);
		
		double max=0;
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
				}
		}
		System.out.println(max);
	}
}
