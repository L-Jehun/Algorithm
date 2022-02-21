import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1546{
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[n];
		double max = Double.MIN_VALUE;
		double sum =0;
		for(int i=0;i<n;i++) {
			arr[i] = Double.parseDouble((st.nextToken()));
			if(max<arr[i]) max = arr[i];
		}
		for(int i=0;i<n;i++) {
			sum+=((arr[i]/max)*100);
		}
		System.out.println(sum/n);
	}
}
