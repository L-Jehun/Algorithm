import java.util.*;
import java.io.*;

class Baek_2559 {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	//2559
    	int N=Integer.parseInt(st.nextToken());//전체 날짜 수
    	int K=Integer.parseInt(st.nextToken());//연속적 날짜
    	st = new StringTokenizer(br.readLine());
    	int []day = new int[N];
    	int res = 0;
    	
    	for(int i=0;i<N;i++) {
    		day[i]=Integer.parseInt(st.nextToken()); 		
    	}
    	for(int i=0;i<=N-K;i++) {
    		int sum=0;
    		for(int j=i;j<i+K;j++) {
    			sum += day[j];
    		}
    		res = Math.max(res, sum);
    	}
    	
    	System.out.println(res);
    	
 
	}
}