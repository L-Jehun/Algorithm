import java.util.Scanner;

public class JongOl_1719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;//높이
		int m;//종류 1. 좌하 직각삼각형 2. 좌상 직각삼각형 3. 정삼각형
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		if(0>n|| n>99 || m>4 || m<=0||n%2==0) {
			System.out.println("INPUT ERROR!");
			return;
			}
		switch (m) {

		case 1:
			for(int i =0;i<n/2+1;i++) {
				for(int j=0;j<=i;j++) {
					System.out.printf("*");
					}
					System.out.println();
			}
			for(int i =0;i<n/2;i++) {
				for(int j=0;j<n/2-i;j++) {
					System.out.printf("*");
					}
					System.out.println();
			}
			break;
		case 2:
			for(int i =0;i<n/2+1;i++) {
				for(int j=0;j<n/2-i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
				System.out.printf("*");
				}
				System.out.println();
			}
			for(int i =0;i<n/2+1;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<n/2-i;j++) {
				System.out.printf("*");
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i =0;i<n/2+1;i++) {
				for(int j=0;j<i;j++) {
					System.out.printf(" ");
					}
				for(int j=0;j<n-2*i;j++) {
					System.out.print("*");
				}
					System.out.println();
			}
			for(int i =0;i<n/2;i++) {
				for(int j=0;j<n/2-i-1;j++) {
					System.out.printf(" ");
					}
				for(int j=0;j<=2*i+2;j++) {
					System.out.print("*");
				}
					System.out.println();
			}
			break;
		case 4:
			for(int i =0;i<=n/2;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=n/2-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i =0;i<n/2;i++) {
				for(int j=0;j<n/2;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			break;

		default:
			break;
		}
		
	}

}
