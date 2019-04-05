package exam03;

public class pimNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=2; i<100; i++) {
			boolean flag=false;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {//continue;
				System.out.print(i+"\t");
				cnt++;
				if(cnt%5 == 0)System.out.println();
			}
			//flag가 true이면... 조건에 true를 넣고 싶다면 생략해도 된다.
//			System.out.print(i+" ");
		}
	}

}
