

import java.util.Scanner;

public class Baek_1592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;//N명, N자리
		int M;//공을 받은 횟수 
		int L;//:L번째 사람에게 공던짐 M홀수 -시계 M 짝수 - 반시계 
		int []temp;//몇번 받았는지 배열로 저장
		int idx=1;
		int res = 0;//공 몇번? 카운트
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // N>=3
		M = sc.nextInt(); // M>=100
		L = sc.nextInt(); // L>=N-1
		temp = new int[N+1];
		temp[1] = 1;
		while(true) {
			if(temp[idx]==M) break;
			
			if(temp[idx]%2==1) idx = idx+L; //홀수일때 시계+	
			else idx = idx -L; //temp[idx]%2==0
			
			if(idx>N) idx = idx-N;
			else if(idx<1) idx = idx+N;
			
			temp[idx]++;
			res++;
		}
		System.out.println(res);
	}
}
