

import java.util.Scanner;

public class swea_2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T;//테케
		int N;//맵크기
		int M;//파리채 크기
		Scanner sc= new Scanner(System.in);
		T=sc.nextInt();
		
		
		for(int test_case=1;test_case<=T;test_case++) {
			N=sc.nextInt();
			M=sc.nextInt();
			int[][]map = new int[N][N];
			int[][]gap = new int[M][M];
			int max=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			//---------------------------------
			
			for(int i=0;i<N-M+1;i++) {
				for(int j=0;j<N-M+1;j++) {
					int sum=0;
					for(int r=0;r<M;r++) {
						for(int c=0;c<M;c++) {
							sum+=map[i+r][j+c];
						}
					}
					if(max<sum) max=sum;
				}
			}
			System.out.println("#"+test_case+" "+max);
			
		}
		
	}
}
