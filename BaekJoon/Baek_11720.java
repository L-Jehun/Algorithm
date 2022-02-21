import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11720{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int [] arr = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i] = num.charAt(i)-48;
			sum+=arr[i];
		}
		System.out.println(sum);
	    }		
}
