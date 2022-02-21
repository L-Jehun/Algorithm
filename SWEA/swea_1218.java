

import java.util.Scanner;
import java.util.Stack;

public class swea_1218 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=10;
		char[] arr;
		int cnt,N;
		Scanner sc= new Scanner(System.in);
		char[] L = {'(', '{', '[', '<'};
        char[] R = {')', '}', ']', '>'};
        
		for(int test=1;test<=t;test++) {
			N=sc.nextInt();
			arr=new char[N];
			arr=sc.next().toCharArray();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
			Stack<Character> st = new Stack<Character>();
			
			loop : for(int i=0;i<N;i++) {
				for(int j=0;j<4;j++) {
					if(arr[i]==L[j]) {
						st.push(arr[i]);
						break;
					}
					if(arr[i]==R[j]) {
						if(st.peek()==L[j]) {
							st.pop();
							break;
						}
						break loop;
					}
				}
			}
			
			System.out.print("#"+ test+" ");
			if(st.empty())
				System.out.print(1);
			else
				System.out.print(0);
			System.out.println();
			
			
		}
		
	}

}
