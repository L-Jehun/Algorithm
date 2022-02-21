
import java.io.*;
import java.util.*;

class swea_1247 {	
	
	static int N;
	static int[][] arr;
	static boolean [] isVisited;
	static int [] res;
	static int min;
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T =Integer.parseInt(br.readLine());	
		
		for(int testCase=1; testCase<=T;testCase++) {
			N = Integer.parseInt(br.readLine());
			arr= new int [N+2][2];//인덱스 , 0-x 1-y
			isVisited = new boolean[N+2];
			res = new int[N+2];
			min = Integer.MAX_VALUE;
			
			st = new StringTokenizer(br.readLine());
			//집
			arr[0][0]=Integer.parseInt(st.nextToken());
			arr[0][1]=Integer.parseInt(st.nextToken());	
			//회사
			arr[N+1][0]=Integer.parseInt(st.nextToken());
			arr[N+1][1]=Integer.parseInt(st.nextToken());
			for(int i=1;i<=N;i++) {
				arr[i][0]=Integer.parseInt(st.nextToken());
				arr[i][1]=Integer.parseInt(st.nextToken());		
			}
			Permutaion(1);				
			
		
			
			System.out.println("#"+testCase+" "+min);
			
		}
    }

	private static void Permutaion(int cnt) {
		if(cnt==N+1) {
			int sum= 0;
			for(int i=0;i<N+1;i++) {
				sum+= Math.abs(arr[res[i]][0]-arr[res[i+1]][0])+Math.abs(arr[res[i]][1]-arr[res[i+1]][1]);
			}
			if(sum<min) min = sum;
			return;
		}
		
		res[0] =0;
		isVisited[0] = true;
		res[N+1] =N+1;
		isVisited[N+1] = true;
		
		for(int i=1;i<N+1;i++) {
			if(!isVisited[i]) {
				res[cnt] = i;
				isVisited[i]=true;
				Permutaion(cnt+1);
				isVisited[i]=false;
			}
		}
		
	}
}


