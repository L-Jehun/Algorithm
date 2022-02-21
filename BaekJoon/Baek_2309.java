import java.util.Arrays;
import java.util.Scanner;

public class Baek_2309 {
	
	
    public static void main(String[] args) { 
    	Scanner sc = new Scanner(System.in);
       int sum=0;
       
       int[]arr = new int[9];
       for(int i=0;i<9;i++) {
    	   arr[i]=sc.nextInt();  	   
    	   sum+=arr[i];
       }
       
       for(int i=0;i<9;i++) {
    	   for(int j=i+1;j<9;j++) {
    		   if(arr[i]+arr[j]==sum-100) {
    			   arr[i]=0;
    			   arr[j]=0;
    			   break;
    		   }
    	   }
       }
       Arrays.sort(arr);
       for(int i =2;i<9;i++) {
    	   System.out.println(arr[i]);
       }       
    }
}