import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_8320 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n =Integer.parseInt(input.readLine());
         
        int cnt=0;
        for(int i=1;i<=n;i++) {//세로 길이 늘려주면서 1 2 3 4 5 
            for(int j=i;j*i<=n;j++) {//세로*가로가 n보다 작을때 카운트 1*1 1*2 1*3 1*4 1*5 22 
                cnt++;
            }
        }
        System.out.println(cnt);
 
    }
	
}
