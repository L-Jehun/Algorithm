import java.util.Scanner;

public class Baek_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;//카드갯수
		int M;//합 M
		int [] card;
		int res = 0;
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		card = new int[N];		
		for(int i=0;i<N;i++) {
			card[i]=sc.nextInt();
		}
		//브루트 포스
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					
					int temp = card[i]+card[j]+card[k];
					
					if(temp>M) break;
					
					if(M-res > M - temp) res = temp;
				}
			}
		}
		System.out.println(res);
	}

}
