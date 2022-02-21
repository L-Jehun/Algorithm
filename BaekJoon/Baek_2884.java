import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2884{
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = (Integer.parseInt(st.nextToken()))-45;
		if(y<0) {
			x=x-1;
			y=y+60;
		}
		if(x<0) x=x+24;
		System.out.println(x+" "+y);
	}
}
