package test0405;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=i+j;
				System.out.printf("a[%d][%d]=%d\t", i,j,a[i][j]);
			}
			System.out.println();
		}
		int[][]b=new int[3][];
		b[0]= new int[3];
		b[1]= new int[2];
		b[2]= new int[4];
	
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++){
				b[i][j]=i+j;
				System.out.printf("b[%d][%d]=%d\t", i,j,b[i][j]);
			}
			System.out.println();
		}
	}

}
