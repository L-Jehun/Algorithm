import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_3040 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int []arr = new int[9];
		int sum=0;
		int resnum;
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		resnum=sum-100;
		loop: for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++){
				if(arr[i]+arr[j]==resnum) {
					arr[i]=0;
					arr[j]=0;
					break loop;
					}				
			}
		}
		for(int i=0;i<9;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
		}
}
	