import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_58{
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			int res = A*B*C;
			int [] arr = new int[10];
			String str = String.valueOf(res);
			for(int i=0;i<str.length();i++) {
				arr[str.charAt(i)-48]++;
			}
			for(int i=0;i<=9;i++) {
				System.out.println(arr[i]);
			}
			
	}
}
