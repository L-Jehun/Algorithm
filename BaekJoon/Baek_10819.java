import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Baek_10819{
	static int [] arr,temp;
	static int n;
	static int result;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		temp = new int[n];
		isVisited = new boolean[n];
		result=0;
			
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			perm(0);

	        System.out.println(result);
	}

	private static void perm(int count){
        if(count == n){
            int sum =0;
            for (int i = 0; i <n-1 ; i++) {
                sum += Math.abs(temp[i] - temp[i+1]);
            }
            result = Math.max(result,sum);
            return;
        }
 
        for (int i = 0; i <n ; i++) {
            if(isVisited[i]){
                continue;
            }
            isVisited[i] =true;
            temp[count] = arr[i];
            perm(count+1);
            isVisited[i] =false;
        }
    }
	
}

