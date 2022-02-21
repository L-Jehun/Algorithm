import java.util.*;
import java.io.*;

class Baek_1992 {
    static int N;
    static int [][]map;
	static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        //분할 정복
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	N = Integer.parseInt(br.readLine());
    	
    	 map = new int[N][N]; // ex 8*8
       
         for(int i=0;i<N;i++) {
        	 String str = br.readLine();
        	 for(int j=0;j<N;j++) {
        		 map[i][j]=str.charAt(j)-'0';
        	 }
         }
         /*for(int i=0;i<N;i++) {
        	 for(int j=0;j<N;j++) {
        		 System.out.print(map[i][j]);
        	 }
        	 System.out.println();
         }*/
        divide(0,0,N);
        System.out.println(sb);
    }

	private static void divide(int x, int y, int N) { //0,0,8
		if(isPossible(x,y,N)) {
			sb.append(map[x][y]);
			return;
		}
		int halfN = N/2; //ex 8*8-> 4*4
		sb.append('(');
		
		divide(x, y, halfN);						// 왼쪽 위 ex>0,0
		divide(x, y + halfN, halfN);				// 오른쪽 위 ex>0, 4
		divide(x + halfN, y, halfN);				// 왼쪽 아래 ex>4, 0
		divide(x + halfN, y + halfN, halfN);		// 오른쪽 아래 ex>8, 8
		
		sb.append(')');
	}

	public static boolean isPossible(int x, int y, int N) {
		for(int i = x; i < x + N; i++) {
			for(int j = y; j < y + N; j++) {
				if(map[x][y] != map[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}