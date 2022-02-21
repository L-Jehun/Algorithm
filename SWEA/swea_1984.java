import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1984 {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		double sum;
		for(int tc = 1 ; tc <= T ; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int []arr = new int[10];
			sum=0;

			int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
			for(int i=0;i<10;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);
				System.out.println(max+" "+min);
			}
			for(int i=0;i<10;i++) {
				if(arr[i] == min || arr[i] == max) continue;
					sum += arr[i];
				
			}
			System.out.println("#"+tc+" "+Math.round(sum/8.0));
		}
	}
}
	