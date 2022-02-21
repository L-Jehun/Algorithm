import java.util.Scanner;

public class Baek_2578 {

    static int[][] arr=new int [5][5];;
    static int resCnt;
    
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<=25;i++) {
			num=sc.nextInt();
			System.out.println("i : "+i);
			for(int r=0;r<5;r++) {
				for(int c=0;c<5;c++) {
					if(arr[r][c]==num) {arr[r][c]=0;}
					
					System.out.print(arr[r][c]+ "\t" );
				}		
				System.out.println();
			}
			if(i>4) {				
				rowCheck();System.out.println("r: "+resCnt);
				colCheck();System.out.println("r+c: "+resCnt);
				leftDownCheck();System.out.println("r+c+L :"+resCnt);
				rightDownCheck();System.out.println("r+c+L+R :"+resCnt);
				
				if(resCnt>=3) {
					System.out.println(i);
					break;
				}
				resCnt = 0;
			}
		}		
	}
	
	public static void rowCheck() {
		for(int i=0;i<5;i++) {
			int cnt=0;
			for(int j=0;j<5;j++) {
				if(arr[i][j]==0)cnt++;
				if(cnt==5)resCnt++;
			}
		}
	}
	
	public static void colCheck() {
		for(int i=0;i<5;i++) {
			int cnt=0;
			for(int j=0;j<5;j++) {
				if(arr[j][i]==0)cnt++;
				if(cnt==5)resCnt++;
			}
		}
	}
	
	public static void leftDownCheck() {
		int cnt=0;
		for(int i=0;i<5;i++) {		
				if(arr[i][i]==0)cnt++;
				if(cnt==5)resCnt++;
		}
	}
	
	public static void rightDownCheck() {
		int cnt=0;
		for(int i=0;i<5;i++) {
			if(arr[i][4-i]==0)cnt++;
			if(cnt==5)resCnt++;
		}
	}	
}
	