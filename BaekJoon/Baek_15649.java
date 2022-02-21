import java.util.Scanner;

public class Baek_15649 {

	public static int[] arr;
	public static boolean[] ch;
	
	
	//1~N M개 선택 
	private static void func(int N, int M, int depth) {
		
		if(depth==M) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			return;
		}
		for(int i=0;i<N;i++) {
				if(!ch[i]) {
					ch[i] = true;
					arr[depth]=i+1;
					func(N,M,depth+1);
					ch[i]=false;
				}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int N;
		int M;
		N=sc.nextInt();
		M=sc.nextInt();
		ch = new boolean [N];
		arr = new int[M];
		func(N,M,0);
	}

}
