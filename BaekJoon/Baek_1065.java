import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1065{
	public static void main(String[] args) throws IOException {
		int cnt;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<100) {
			cnt=n;
		}
		else {
			cnt = 99;
			if (n == 1000) { // 예외처리 필수
				n = 999;
			}
 
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10; 
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { 
					cnt++;
				}
			}
		}
		System.out.println(cnt);
    }		
}
