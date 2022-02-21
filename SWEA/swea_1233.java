

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1233 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		int Test=10 ;
		
		
		for(int test_case=1;test_case<=Test;test_case++) {
			int res=1;
			int N=Integer.parseInt(br.readLine());//정점의 총 수
			char info;
			for(int i=0;i<N;i++) {				
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				info = st.nextToken().charAt(0);
				if (st.hasMoreTokens()) {//단말이 아닌경우 숫자가 오면 계산 불가
					if('0'<=info && '9'<=info)res=0;//X					
				}
				else {//단말인데 숫자가 안오면 불가
					if(info<'0'||'9'<info) res=0;						
					}
				}							
			System.out.println("#"+test_case+" "+res);
		}
	}
}
