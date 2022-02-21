import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_4344{
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<t;tc++) {
			int cnt=0,sum=0;
			int avg;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum+=arr[i];
			}
			avg=sum/n;
			for(int i=0;i<n;i++) {
				if(arr[i]>avg) {
					cnt++;	
				}
			}
			
			double res =(double)cnt/n*100;
			System.out.printf("%.3f",res);
			System.out.println("%");
			}
		}
		
}
