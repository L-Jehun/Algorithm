


import java.util.Scanner;

public class sweaLadder_fail {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		
		Scanner sc = new Scanner(System.in);
		int T ;
		T= sc.nextInt();
		int [][]map = new int[100][100];
		int[] dr = {0,0,-1};
		int[] dc = {-1,1,0};
		int r = 0;
		int c = 0;
		int res=0;
		boolean route[][] = new boolean[100][100];
		
		
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					map[i][j]=sc.nextInt();
					if(map[i][j]==2) {
						r=i;
						c=j;				
					}
					System.out.print(map[i][j]);
					
				}
				System.out.println();			
			}
			sc.close();
			while(true) {
				boolean flag =false;
				route[r][c]=true;
				for(int i=0;i<3;i++) {
					int nr = r+dr[i];
					int nc = c+dr[i];
					if( nr == 0 ) {
						res=c;
						flag = true;
						break;
					}
					if(nr<0 || nc<0 || nc>99 || nr>99 || map[nr][nc] == 0 || route[nr][nc]) continue;
					r=nr;
					c=nc;
					break;
				}
				if(flag) break;
			}
			System.out.printf("#%d %d\n", T, res);
		}
		
		
			
	

}
