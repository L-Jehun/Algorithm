

import java.util.Scanner;

public class swea_1289 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		
		for(int tc=1;tc<=T;tc++) {
			String data = sc.next();
			int size = data.length();			
			int cnt =0;
			if(data.startsWith("1")) {
				cnt++;
			}
			for(int i=0;i<size-1;i++) {
				if(data.charAt(i)!=data.charAt(i+1)) {
					cnt++;
				}
			}
			System.out.println("#"+tc+" "+cnt);
		}
	}
}