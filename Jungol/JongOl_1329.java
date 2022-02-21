import java.util.Scanner;

public class JongOl_1329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;//높이
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(0>n|| n>100 || n%2==0) {
			System.out.println("INPUT ERROR!");
			return;
			}
		
			for(int i =0;i<n/2+1;i++) {
				for(int j=0;j<i;j++) {
					System.out.printf(" ");
				}
				for(int j=0;j<2*i+1;j++) {
					System.out.printf("*");
					}
				System.out.println();
				}
			for(int i =0;i<n/2+1;i++) {
				for(int j=0;j<n/2-i-1;j++) {
					System.out.printf(" ");
				}
				for(int j=0;j<-2*i+n-2;j++) {
					System.out.printf("*");
					}
				System.out.println();
				}
			}
			
		
	}

