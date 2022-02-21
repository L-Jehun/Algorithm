

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea_1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=10;
		Scanner sc= new Scanner(System.in);
		for(int test_case=1;test_case<=t;test_case++) {
			int n =sc.nextInt();
					
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i=0;i<8;i++) {
		       	q.offer(sc.nextInt());
			}
		 loop : while(true) {
		       	for(int i=1;i<=5;i++) {
		       		int num=q.poll();
		       		num-=i;
		       		if(num<0) num =0;
		       		q.offer(num);
		       		if(num==0) break loop;
		       	}
		    }
			
			 System.out.print("#" + test_case + " ");
	            while(!q.isEmpty()) {
	                System.out.print(q.poll() + " ");
	            }
	            System.out.println();		
		            
					
		}
	}

}
