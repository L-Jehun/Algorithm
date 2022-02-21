import java.util.Arrays;
import java.util.Scanner;

public class Baek_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int N; //사람의 수 1<N<1000
		N = sc.nextInt();
		int[] Pi = new int[N] ; // 걸리는 시간 1<Pi<1000
		int temp=0;
		int res=0 ;		
		for(int i=0; i<N;i++) {
			Pi[i]=sc.nextInt();
		}
		//짧은 사람이 앞으로 와야 최소값.
		Arrays.sort(Pi);
		for(int i=0;i<N;i++){
			//System.out.println(res);
			res+=temp+Pi[i];
			temp+=Pi[i];
		}
		//
		System.out.println(res);
	}

}
