import java.util.*;
import java.io.*;

class Baek_8958 {

	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T=Integer.parseInt(br.readLine());
    	for(int i=0;i<T;i++) {
    		int sum=0,cnt=0;
    		char[] arr=br.readLine().toCharArray();
    		for(int j=0;j<arr.length;j++) {
    			if(arr[j]=='O') {
        			cnt++;
        			sum+=cnt;
        		}
        		else cnt=0;	
    		} 		
    		System.out.println(sum);
    	}    	
    }   
}