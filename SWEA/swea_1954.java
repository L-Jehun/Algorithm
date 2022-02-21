

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1954 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int T =Integer.parseInt(input.readLine());
		
		for(int i=1;i<=T;i++) {
			int N;
			N = Integer.parseInt(input.readLine());
			int num=1;
			int x=0;
			int ex=N-1;
			int y=0;
			int ey=N-1;
			int [][]arr= new int[N][N];
			while(num<=N*N){
				for(int j=y;j<=ey;j++){//좌상->우상
					arr[x][j]=num;
					num++;
				}
				x++;
				for(int j=x;j<=ex;j++) {//우상->우하
					arr[j][ey]=num;
					num++;
				}
				ey--;
				for(int j=ey;j>=y;j--) {//우하 ->>좌하
					arr[ex][j]=num;
					num++;
				}
				ex--;
				for(int j=ex;j>=x;j--) {//좌하-->좌상
					arr[j][y]=num;
					num++;
				}
				y++;
			}
			System.out.println("#" + i);
			for(int r=0;r<N;r++) {
				for(int c=0;c<N;c++) {
					System.out.print(arr[r][c]+" ");
				}
				System.out.println();
			}
		}
	}		
}
