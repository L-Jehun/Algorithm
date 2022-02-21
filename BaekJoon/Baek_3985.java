import java.util.Scanner;

public class Baek_3985{
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		int L=sc.nextInt();//롤케이크 길이
		int N=sc.nextInt();//방청객 수
		int Pi,Pk;//Pi부터  Pk까지 먹고싶다.
		int exRes = 0,relRes = 0;//기대 , 진짜
		int piece;
		int max =0 ,maxPiece=0;
		int[] cake = new int [L];
		
		for(int i=0;i<N;i++) {
			Pi = sc.nextInt();
			Pk = sc.nextInt();
		
			if((Pk-Pi)>max) {
				max = (Pk-Pi);
				exRes = i+1;
			}//max 값 비교 하여 기대 res 방청객 index 넣어줌
			
			piece=0;
			for(int j=Pi-1;j<Pk;j++) {
				if(cake[j]==0) {
					cake[j]=i+1;
					piece++;
				}
			} //배열 비어있으면 방청객 인덱스 넣어주고 sum
			if(piece>maxPiece) {
				relRes=i+1;
				maxPiece=piece;
			}
		}
		System.out.println(exRes);
		System.out.println(relRes);
		
		
	}
}