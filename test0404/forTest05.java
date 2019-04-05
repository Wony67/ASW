package test0404;

public class forTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			for(int j=-4; j<5; j++) {
				if(j<=i && j>=-i)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		for(int i=4; i>=0; i--) {
			for(int j=-4; j<5; j++) {
				if(j<=i && j>=-i)
					System.out.print('*');
				else
					System.out.print(' ');
		}
			System.out.println();
	}

}
}


// i = 0~4
// -i<= j <=i   -> '*'
// |j|>i        -> ' '
// j<-i j>i