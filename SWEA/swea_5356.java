import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class swea_5356 {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int tc = 1 ; tc <= T ; tc++) {
			System.out.print("#"+tc+" ");
			char [][] arr = new char[5][15];
			
			for(int i=0;i<5;i++) {
				String str = br.readLine();
				arr[i]=str.toCharArray();
			}
			for(int i=0;i<15;i++) {
				for(int j=0;j<5;j++) {
					if(i < arr[j].length)
					System.out.print(arr[j][i]);
					
					
				}
			}
			System.out.println();
		}
	}
}
	