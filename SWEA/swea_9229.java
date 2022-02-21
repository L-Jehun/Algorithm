

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_9229 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		for(int test_case=1;test_case<=T;test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());//봉지 개수
			int M = Integer.parseInt(st.nextToken());//무게 제한 2<M<2000000 & (1 ≤ ai ≤ 1000000)
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int sum=0;
			
			for(int i=0;i<N;i++){
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			loop :for(int i=0;i<N-1;i++) {
				 for(int j=i+1;j<N;j++) {
					 if(arr[i]+arr[j]<=M && sum < arr[i]+arr[j]) {
						 sum = arr[i]+arr[j];
					 }
					 if(arr[i]+arr[j]==M) {
						 break loop;
					 }
				 }				 
			}
			if(sum == 0) {
				 sum=-1;
			 }
			System.out.print("#"+test_case+" "+sum);
		}
	}

}
