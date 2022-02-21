

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class swea_2805 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int T;//테케
		T=Integer.parseInt(input.readLine());
		int N;//크기
		int sum=0;
		N=Integer.parseInt(input.readLine());
		char [][] map = new char[N][N];
		
		for(int test_case=1;test_case<=T;test_case++) {
		for(int i=0;i<N;i++) {
			String str =input.readLine();
			map[i]=str.toCharArray();
		}
		//--------------------------------------
		for(int i = 0; i <= N/2; i++) {
        	for(int j = N/2 - i; j <= N/2 + i; j++) {
        		sum += map[i][j]-'0';
        		
        	}
        	
        }//상단 삼각형(중간부까지)
        int a = 1;
        for(int i = N/2 +1 ; i < N; i++) {
        	for(int j = a; j <= N-1-a; j++) {
        		sum += map[i][j]-'0';
        	}
        	a++;
        }
	        System.out.println("#"+test_case+" "+ sum);
		}
	}
}