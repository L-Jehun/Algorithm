import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_2961 {
	static int min = Integer.MAX_VALUE;
	static int [][]taste;
	static int N;
	static boolean [] visited;
	
	public static void func(int i,int s,int b) {
		if(i==N) {
			if(min> Math.abs(s - b) && b!=0) {
				min = Math.abs(s-b);
			}
			return;
		}
		
		visited[i]=true;
		func(i+1,s*taste[0][i],b+taste[1][i]);
		visited[i]=false;
		func(i+1,s,b);
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());	
		taste = new int[2][N];
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			taste[0][i]=Integer.parseInt(st.nextToken());
			taste[1][i]=Integer.parseInt(st.nextToken());
		}
		func(0,1,0);
		System.out.println(min);
		}
}
	