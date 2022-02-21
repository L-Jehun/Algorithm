
import java.io.*;
import java.util.*;

class swea_1974 {
	static int[][] board;
	static int [] num;
	
	public static void main(String []args) throws Exception {  
		Scanner sc = new Scanner (System.in);
		int T =sc.nextInt();
		for(int test_case=1;test_case<=T;test_case++) {
			board= new int[9][9];
			
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					board[i][j]=sc.nextInt();
				}
			}
			
			if(rowCheck()&&colCheck()&&boxCheck()) {
				System.out.println("#"+test_case+" 1");
			}else {
				System.out.println("#"+test_case+" 0");
			}
			
		}
	}
	public static boolean rowCheck() {
		for(int i=0;i<9;i++) {
			num = new int[10];
			for(int j=0;j<9;j++) {
				num[board[i][j]]++;				
			}
			for(int n=1;n<=9;n++) {
				if(num[n]==0) return false;
			}
		}
		
		return true;
	}
	public static boolean colCheck() {
		for(int i=0;i<9;i++) {
			num = new int[10];
			for(int j=0;j<9;j++) {
				num[board[j][i]]++;
				}
			for(int n=1;n<=9;n++) {
				if(num[n]==0) return false;
			}
		}	
		
		return true;
	}
	public static boolean boxCheck() {
		for(int i=0;i<=6;i+=3) {
			for(int j=0;j<=6;j+=3) {
				num = new int[10];
				int r= i+3;
				int c =j+3;
				
				for(int a=i;a<r;a++) {
					for(int b=j;b<c;b++) {
						num[board[a][b]]++;
					}
				}
				for(int n=1;n<=9;n++) {
					if(num[n]==0) return false;
				}
							
			}
		}
		return true;
	}
	
	
}