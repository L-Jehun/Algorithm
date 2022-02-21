import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2851{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		int prevNum;
		int res = 0;
		for(int i=0;i<10;i++) {
			int num = Integer.parseInt(br.readLine());
			sum+=num;
			
			if(100<=sum) {
				res=sum;
				prevNum = sum-num;
				if(Math.abs(100-prevNum)<Math.abs(100-sum)) {
					res=prevNum;
				}
				if(Math.abs(prevNum)==Math.abs(sum)) {
					res=sum;
				}
				break;
			}
			res=sum;
		}
		System.out.println(res);
	}
}