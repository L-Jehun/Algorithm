
import java.io.*;
import java.util.*;

class swea_1238 {	

	static int [][] graph;
	static int n;

	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		for(int test_case=1;test_case<=10;test_case++) {
			st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			graph = new int [101][101];
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<n/2;i++) {
				graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=1;
			}
			System.out.println("#"+test_case+" "+bfs(start));
			
		}
	}

	private static int bfs(int start) {
		int[] visit = new int [101];
		int maxCnt =0, ans =0;
		Queue<Integer> q= new LinkedList<Integer>();
		q.offer(start);
		visit[start]=1;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i=1;i<101;i++) {
				if(graph[cur][i] != 1 || visit[i] != 0) continue;
				
				visit[i] = visit[cur]+1;
				q.offer(i);
			}
			maxCnt = visit[cur];
		}
		
		for(int i=1;i<101;i++) {
			if(maxCnt != visit[i]) continue;
			ans = ans > i ? ans : i;
		}
		return ans;
	}
}


