import java.util.*;


import java.io.*;

class Baek_10157 {
	
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int C = Integer.parseInt(st.nextToken());
    	int R = Integer.parseInt(st.nextToken());
    	int N = Integer.parseInt(br.readLine());
    	int [][]map = new int [R][C];
    	int []dx = {-1,0, 1, 0}; // 상 우 하 좌
    	int []dy = { 0,1, 0,-1};
    	
    	
    	int x = R-1;
    	int y = 0;
    	int dir= 0;
    	int num=1;
    	
    	while(num<N){
    	map[x][y]=num;
    	int	nx = x+dx[dir%4];
    	int	ny = y+dy[dir%4];
    		
    		if(nx<0 || ny<0 || nx>=R || ny>=C || map[nx][ny] !=0) {
    			dir++;
    			nx = x+dx[dir%4];
    			ny = y+dy[dir%4];
    		}
    		x=nx;
    		y=ny;    		
    		num++;
    	}
    	for(int i=0;i<R;i++) {
    		for(int j=0;j<C;j++) {
    			System.out.print(map[i][j]+" ");
    		}System.out.println();
    	}
    	if(R*C<N) System.out.print("0");
    	else System.out.println(y+1 + " "+ (R-x));
    }

}