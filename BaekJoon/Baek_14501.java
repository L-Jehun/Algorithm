import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_14501{
	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int [][] cal = new int[N+1][2];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			cal[i][0] = Integer.parseInt(st.nextToken());//t
			cal[i][1] = Integer.parseInt(st.nextToken());//p
		}
		int []dp = new int[N+2];
		for(int i=1;i<N+1;i++) {
			if(i+cal[i][0]<=N+1) {
				dp[i + cal[i][0]] = Math.max(dp[i + cal[i][0]], dp[i] + cal[i][1]);
				//
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(dp[N+1]);
	}
}

