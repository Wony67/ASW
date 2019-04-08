
public class quest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
		String rank[] =	{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", 
				"Queen", "King", "Ace"};
		
		for(int i=0; i<5; i++) {
			int a=(int)(Math.random()*suit.length);
			int b=(int)(Math.random()*rank.length);
			System.out.println(suit[a]+"의"+rank[b]);
		}
	}

}
