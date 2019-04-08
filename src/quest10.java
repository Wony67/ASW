import java.util.Scanner;

public class quest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("학생수 입력>>");
		int size=scanner.nextInt();
		int[][] score=new int[size][6];
		for(int i=0; i<size; i++) {
			score[i][0] =i+1;
			System.out.print("국어점수 입력>>");
			score[i][1]=scanner.nextInt();
			System.out.print("수학점수 입력>>");
			score[i][2]=scanner.nextInt();
			System.out.print("영어점수 입력>>");
			score[i][3]=scanner.nextInt();
			int sum=0;
			for(int j=1; j<4; j++) {
				sum+=score[i][j];
			}
			score[i][4]=sum/3;
		}
		int avgKor=0, avgMath=0, avgEng=0;
		for(int i=0; i<size; i++) {
			int rank=1;
			for(int j=0; j<size; j++) {
				if(score[j][4]>score[i][4])
					rank++;
			}
			score[i][5]=rank;
			avgKor+=score[i][1];
			avgMath+=score[i][2];
			avgEng+=score[i][3];
		}
		System.out.println("번호\t국어\t수학\t영어\t평균\t석차");
		for(int i=0; i<size; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("평균\t"+avgKor/size+"\t"+avgMath/size+"\t"+avgEng/size);
	}

}
