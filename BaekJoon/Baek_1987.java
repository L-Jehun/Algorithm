import java.util.*;
import java.io.*;

class Baek_1987 {
	static int R,C,res=0;
	static char[][] map;
	static boolean[] isVisited = new boolean[26];
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	R=Integer.parseInt(st.nextToken());
    	C=Integer.parseInt(st.nextToken());
    	map = new char[R][C];
    	for(int i=0;i<R;i++) {
    			map[i]=br.readLine().toCharArray();
    	}
    	
    	dfs(0,0,1);
    	System.out.print(res);
    }


	private static void dfs(int x, int y, int cnt) {
		int[] dy = {-1,1,0,0};
		int[] dx = {0,0,-1,1};//상하좌우
		
		isVisited[ map[x][y] - 'A' ]= true;
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isIn(nx,ny)) {
				if(!isVisited[map[nx][ny] - 'A']) {
					dfs(nx,ny,cnt + 1);
				}
			}
		}
		isVisited[ map[x][y] - 'A'] = false;
		res = Math.max(res, cnt);
		
		
	}

	private static boolean isIn(int nx, int ny) {
		if (0 <= nx && nx < R && 0 <= ny && ny < C) return true;
		else return false;
	}


	
}