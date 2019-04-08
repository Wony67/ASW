
public class quest08 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] histo=new int[10];
		for(int i=0; i<10; i++) {
			int num=(int)(Math.random()*100)+1;
			num=(int)(Math.ceil(num/10.0));
			histo[num-1]++;
		}
		for(int i=0; i<10; i++) {
			int h=(i+1)*10;
			System.out.print(h-9+"~"+h+":");
			for(int j=0; j<histo[i]; j++) {
				System.out.print("*");
			}				
			System.out.println();
		}
	}

}
