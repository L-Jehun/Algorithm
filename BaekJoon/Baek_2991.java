import java.util.Scanner;

public class Baek_2991 {

	static int max=0;
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int A=sc.nextInt();//1개 짖
		int B=sc.nextInt();;//1개 쉿
		int C=sc.nextInt();;//2개 짖
		int D=sc.nextInt();;//2개 쉿
		int []worker = new int[3];
		int []Dog1;
		int []Dog2;
		

		for(int i=0;i<3;i++) {
			worker[i]=sc.nextInt();
			if(worker[i]>max) max=worker[i];
		}
		
		Dog1 = makeDog(A,B);
		Dog2 = makeDog(C,D);
		
		for(int i=0;i<3;i++ ) {
			int cnt=0;
			if(Dog1[worker[i]-1]==1) cnt++;
			if(Dog2[worker[i]-1]==1) cnt++;
			System.out.println(cnt);			
		}	
		for(int i=0;i<Dog1.length;i++)System.out.print(Dog1[i]+" ");
		System.out.println();
		for(int i=0;i<Dog2.length;i++)System.out.print(Dog2[i]+" ");
					
	}
	
	public static int[] makeDog(int A, int B) {
		int rotateDog = max/(A+B)+1;
		int []Dog;
		int arrLength=(A+B)+(A+B)*(rotateDog-1);
		if (max==A+B)rotateDog=1;
		Dog = new int[arrLength];
		int a=0;
		for(int i=0;i<rotateDog;i++) {		
			for(int j=a;j<a+A;j++) {
				Dog[j]=1;
			}
			a+=A+B;
		}
		return Dog;			
		}
}
	