import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1110{
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt=0;
		int newnum;
		int temp = num;
		while(true) {
			cnt++;
			newnum= (num/10+num%10)%10+num%10*10;
			if(newnum==temp) break;
			num=newnum;
		}
		System.out.println(cnt);
	}
}
