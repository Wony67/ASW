package test0405;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[10];
//		intArray[0]=1;
//		intArray[0]=2;
//		intArray[0]=3;
//		intArray[0]=4;
//		intArray[0]=5;
//		intArray[0]=6;
//		intArray[0]=7;
//		intArray[0]=8;
//		intArray[0]=9;
//		intArray[0]=10;
		for(int i=0; i<10; i++) {
			intArray[i]=(int)(Math.random()*100)+1;
			System.out.println("intArray[" + i + "]="+intArray[i]);
		}
		
		int[] intArr= {0,1,2,3,4};
	//  int[] intArr=new int[5];
//	      	intArr[0]=0;
//		    intArr[1]=1;
//		    intArr[2]=2;
//		    intArr[3]=3;
//		    intArr[4]=4;
		for(int i=0; i < intArr.length; i++){
			System.out.println(intArr[i]);
		}
	}

}
