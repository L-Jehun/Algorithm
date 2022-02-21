import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_2007 {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		
		for(int tc = 1 ; tc <= T ; tc++) {
			char arr[]=new char[30];
			String str = br.readLine();
			arr= str.toCharArray();
			for(int i=0;i<arr.length;i++) {
				if(arr[0]==arr[i] && arr[1]==arr[i+1] && i!=0) {
					System.out.print("#"+tc+" "+i);
					break;
				}
			}
			
			
			System.out.println();
		}
	}
}
	