import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_7576{
	
	static int N,M,result = Integer.MIN_VALUE;
	
	static int[][] map;
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = { 0, 0,-1, 1};//상하좌우

	
	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
			}
			
			DFS(0);
		}
	}

	private static void DFS(int cnt) {
		// TODO Auto-generated method stub
		if(cnt==3) {
			BFS();
			return;
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					DFS(cnt+1);
					map[i][j] = 0;
				}
			}
	}
}

	private static void BFS() {
		// TODO Auto-generated method stub
		
	}
}
