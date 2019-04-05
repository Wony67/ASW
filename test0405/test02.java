package test0405;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[10];
		for(int i=0; i<10; i++) {
			intArray[i]=(int)(Math.random()*100)+1;
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		int max=0;
		int sum=0;
				
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i]>max)
				max=intArray[i];
			sum+=intArray[i];
		}
		System.out.println("max="+max);
		System.out.println("avarage="+sum/intArray.length);
	}
}
