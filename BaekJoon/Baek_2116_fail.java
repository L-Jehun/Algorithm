import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2116_fail {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N= Integer.parseInt(br.readLine());//주사위 개수
		int [][]dice = new int [N][6];
		boolean [][]isSelected;
		int sum;
		int up=0;
		int down=0;
		for(int i=0;i<N;i++) { // 마주보는변 (i+3)%6
			st = new StringTokenizer(br.readLine());
			dice[i][0] = Integer.parseInt(st.nextToken());
			dice[i][1] = Integer.parseInt(st.nextToken());
			dice[i][2] = Integer.parseInt(st.nextToken());
			dice[i][5] = Integer.parseInt(st.nextToken());
			dice[i][3] = Integer.parseInt(st.nextToken());
			dice[i][4] = Integer.parseInt(st.nextToken());
		}		
		
		for(int i=0;i<6;i++) { //i=0 번 주사위 윗면 선택.
			isSelected=new boolean[N][7];
			sum=0;
			up = dice[0][i];
			down = dice[0][(i+3)%6];
			isSelected[0][up]=true;//윗면이 선택 되면
			isSelected[0][down]=true;			
			
			for(int j=1;j<N;j++) {
				for(int k=0;k<6;k++) {
					if(dice[j][k]==up) {
						down=dice[j][k];
						up=dice[j][(k+3)%6];
						isSelected[j][up]=true;
						isSelected[j][down]=true;
						break;
					}
				}				
			}
			for(int j=0;j<N;j++) {
				System.out.println();
				for(int k=0;k<6;k++) {
					if(!isSelected[j][dice[j][k]]){
			System.out.print(dice[j][k]+" ");
			}
					}
				}
			
			/*for(int j=0;j<N;j++) {
				int max=1;
				for(int k=0;k<6;k++) {
					if(!isSelected[j][dice[j][k]]){
						if(max<dice[j][k]) max=dice[j][k];
					}
					System.out.println(k+"줄 max값 : "+max);
				}
				sum+=max;
			}
			System.out.println(i+" :"+sum+"-------------------");*/
			
			System.out.println(i+"----------------------------------");		
		
		}
	}
}
