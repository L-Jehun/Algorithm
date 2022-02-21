import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String A =change(st.nextToken());
		String B =change(st.nextToken());
		System.out.println(Math.max(Integer.parseInt(A),Integer.parseInt(B)));
	}
	private static String change(String str) {
		String changeNum = str.charAt(2)+""+str.charAt(1)+""+str.charAt(0);
		return changeNum;
	}
}