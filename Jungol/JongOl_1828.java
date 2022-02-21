import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JongOl_1828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int [][]arr = new int [N][2];
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.nextInt();//최저 온도
			arr[i][1] = sc.nextInt();//최고 온도
		}
		
		Arrays.sort(arr, new Comparator<int []>() {//최대온도 오름차순

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		
		});
		
		/*for(int i=0;i<N;i++)
		System.out.println(Arrays.toString(arr[i]));*/
		int cnt =1; 
		int max = arr[0][1];
		for(int i=0;i<N;i++) {
			if(max < arr[i][0]) {//냉장고의 온도보다 높은 최저온도 만났을때 
				max = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
