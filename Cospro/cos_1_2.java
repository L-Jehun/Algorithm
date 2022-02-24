// You may use import as below.
//import java.util.*;

class cos_1_2 {
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int idx = 0;
        int num = 1 ;

        for(int i=0 ; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		arr[x][y]=num++;
        		
        		if(x+dx[idx]<0|| x+dx[idx]>=n || y+dy[idx]<0 || y+dy[idx]>=n || arr[x+dx[idx]][y+dy[idx]]!=0) {
        			idx++;
        			if(idx ==4) idx=0;
        		}
        		x+=dx[idx];
        		y+=dy[idx];
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(arr[i][j]);
        	}
        	System.out.println();
        }
        
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	cos_1_2 sol = new cos_1_2();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}