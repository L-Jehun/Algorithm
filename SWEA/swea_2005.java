import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2005 {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int num = 1;
		for(int tc = 1 ; tc <= T ; tc++) {
			int n = Integer.parseInt(br.readLine());
			int [][]arr = new int [n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					if(i==j || j==0)arr[i][j] =1 ;
					else {
						arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
					}
				}
			}
			System.out.println("#"+tc+" ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
	