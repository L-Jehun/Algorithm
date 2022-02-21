import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class swea_7964{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		int res = 0;
		
		for(int i=0;i<n;i++) {
			if(Integer.parseInt(st.nextToken())==0) {
				cnt++;
			}else cnt=0;
			
			if(cnt>=d) {
				res++;
				cnt=0;
			}
		}
		
		System.out.println("#"+tc+" "+ res);
		}
	}
}