
import java.io.*;
import java.util.*;

class swea_4012 {
	
	static int N;
	static int[][] map;
	static int min;
	static boolean[] isSelected;
	
	public static void main(String []args) throws NumberFormatException, IOException {
		//조합 -> axay+ayax   bxby+bybx min ->res
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1;test_case<=T;test_case++) {	
			
			N= Integer.parseInt(br.readLine());

			map=new int[N][N];
			
			for(int i=0; i<N;i++) {
				st= new StringTokenizer(br.readLine()," ");
				for(int j=0; j<N;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			isSelected = new boolean[N];
			min=Integer.MAX_VALUE;
			
			sb.append("#"+test_case+" ");
			Combination(0, 0);
			sb.append(min+"\n");			
		}
		System.out.println(sb.toString());
		
	}
	public static void Combination(int cnt ,int start) {
		if(cnt == N/2) {
			checkFunc();
			return;
		}
		for(int i=start; i<N;i++) {
			isSelected[i]=true;
			Combination(cnt+1,i+1);
			isSelected[i]=false;
		}
	}
	 public static void checkFunc() {
        int A=0, B=0, result=0;
        
        for(int i=0;i<N-1;i++) {
            for(int j=i+1;j<N;j++) {
                if(isSelected[i] && isSelected[j]) {
                    A+=map[i][j]+map[j][i];
                }
                else if(!isSelected[i] && !isSelected[j]) {
                    B+=map[i][j]+map[j][i];
                }
            }
        }
        result = Math.abs(A-B);
        min = Math.min(result, min);
    }
}


