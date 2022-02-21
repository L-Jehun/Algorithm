import java.util.Scanner;

public class Baek_15671 {

    
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//참고한 부분 turn 넘기는 부분, 델타 반대방향 탐색
		int[] dy = {-1, -1, 0, 1, 1,  1,  0, -1};
	    int[] dx = { 0,  1, 1, 1, 0, -1, -1, -1};//상 ->시계방향
		char[][] board = new char[6][6];
		int n,y,x,nx,ny;
		int cnt;//cnt->몇칸 갔는지
		char[]color = {'B','W'};
		for(int i = 0; i < 6; i++) {
    		for(int j = 0; j < 6; j++) {
    			board[i][j] ='.';
    		}
    	}
    	board[2][2] = 'W';
    	board[3][3] = 'W';
    	board[2][3] = 'B';
    	board[3][2] = 'B';
    	
    	n=sc.nextInt();
    	int turn=0;
    	for(int i = 0; i < n; i++) {
    		y= sc.nextInt()-1;
    		x= sc.nextInt()-1;
    		board[y][x]=color[turn];
    		
    		for(int k=0;k<8;k++) {
    			ny = y + dy[k];
    			nx = x + dx[k];
    			cnt=0;
    			while((ny>=0 && ny<6 && nx>=0 && nx<6) && board[ny][nx] == color[(turn + 1) % 2]) {
    				ny += dy[k];
                    nx += dx[k];
                    cnt ++;
          
    			}
    			if((ny>=0 && ny<6 && nx>=0 && nx<6) && (board[ny][nx] == color[(turn)]) && cnt!=0) {
    				while(cnt>0) {
    					ny+=dy[(k+4)%8];
    					nx+=dx[(k+4)%8];
    					board[ny][nx] = color[turn];
    					cnt--;
    				}
    			}
    		}
    		
//    		int cntW=0,cntB=0;
//        	for(int r=0;r<6;r++) {
//        		for(int c=0;c<6;c++) {
//        			System.out.print(board[r][c]);
//        			if(board[r][c]=='W') 
//        				cntW++;
//        			else if(board[r][c]=='B')
//        				cntB++;
//        		}
//        		System.out.println();
//        	}
    		
 
    		if(turn == 0)
    			turn = 1;
    		else
    			turn = 0;
    	}
    	
    	int cntW=0,cntB=0;
    	for(int r=0;r<6;r++) {
    		for(int c=0;c<6;c++) {
    			System.out.print(board[r][c]);
    			if(board[r][c]=='W') 
    				cntW++;
    			else if(board[r][c]=='B')
    				cntB++;
    		}
    		System.out.println();
    	}
    	if(cntW<cntB)
    		System.out.println("Black");
    	else if(cntW>cntB) 
    		System.out.println("White");
    	
		
		}
}
	