package test0405;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[10];
		for(int i=0; i<10; i++) {
			intArray[i]=(int)(Math.random()*100)+1;
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int num:intArray) {
			// intArray의 각 값들을 순차적으로 가져와서 num에 입력한다.
			sum+=num;
		}
		System.out.println("평균:"+sum/intArray.length);
			
	}

}


//for-each문의 경우 배열의 값들을 수정할 수는 없다.