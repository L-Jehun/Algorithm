
import java.io.*;
import java.util.*;

class swea_6808 {
	
	static int[] kyu;
	static int[] in;
	static int win=0,lose=0;
	public static void main(String []args) throws Exception {  
    	Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		
		for(int test_case=1;test_case<=T;test_case++) {
			boolean[] card= new boolean[19];
			kyu = new int[9];
			in = new int [9];
			
			for(int i=0;i<9;i++) {
				kyu[i]=sc.nextInt();
				card[kyu[i]] = true;
			}
			int j=0;
			for(int i=1;i<=18;i++) {
				if(!card[i]) {
					in[j]=i;
					j++;
				}
			}
			win=0;
			lose=0;
			permutation(0,new int[9],new boolean[9]);
			
			System.out.println("#"+test_case+" "+win+" "+lose);			
		}
    }
	
	static void permutation(int toSelect, int[] isSelected, boolean[] flag) {
		if(toSelect == 9) {
			int scoreK = 0;	// 규영이 점수 합
			int scoreI = 0;	// 인영이 점수 합
			for(int i=0;i<9;i++) {
				if(kyu[i]>isSelected[i])
					scoreK += (kyu[i]+isSelected[i]);
				else
					scoreI += (kyu[i]+isSelected[i]);
			}
			if(scoreK>scoreI) win++;
			else if(scoreK<scoreI) lose++;
			return;
		}
		for(int i=0;i<9;i++) {
			if(!flag[i]) {
				flag[i] = true;
				isSelected[toSelect] = in[i];
				permutation(toSelect+1, isSelected, flag);
				flag[i] = false;
			}
		}
	}
	
}