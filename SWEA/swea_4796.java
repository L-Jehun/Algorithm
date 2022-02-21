import java.util.Scanner;

public class swea_4796 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			int sum = 0;
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=1 ; i<n-1;i++) {
				if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
					int right=1;
					int left=1;
					for(int j=i;0<j;j--) {
						if(j-2>=0 && arr[j-1]>arr[j-2]) left++;
						else break;
					}
					for(int j=i;j<n;j++) {
						if(j+2< n && arr[j+1]>arr[j+2]) right++;	
						else break;
					}
					//System.out.println("i="+i +"일때  "+"left"+left+" right"+ right);
					sum+=left*right;
				}
			}			
			System.out.println("#"+tc+" "+sum);
			
			
		}
		
	}
}
	