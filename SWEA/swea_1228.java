

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class swea_1228 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T=10;
		int N,K;
		for(int test_case=1;test_case<=T;test_case++) {
			int cnt=0;
			N = sc.nextInt();
			LinkedList<Integer> list =new LinkedList<Integer>();
			for(int i=0;i<N;i++) {
				list.add(sc.nextInt());
			}			
			K=sc.nextInt();
			for(int i=0;i<K;i++) {
				String s = sc.next();//i
				int m1=sc.nextInt();// 삽입 자리 m1뒤
				int m2=sc.nextInt();// m2개 숫자 삽입.
				
				for(int j=0;j<m2;j++) {
					list.add(m1,sc.nextInt());
					m1++;
				}
			}
			System.out.print("#"+test_case+" ");
			while(!(list.isEmpty())) {
				if(cnt>9)break;
				System.out.print(list.poll()+" ");
				cnt++;
			}
			System.out.println();
		}
	}

}
