

import java.util.Scanner;

public class Baek_1244 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sw;//스위치 개수
		sw =sc.nextInt();
		int []state = new int [sw]; //스위치 상태
		int stu;//학생수 1남 배수 스위치 상태 바꿈    2녀 좌우 대칭확인->구간 스위치 다 바뀜
		int sex;
		int num;
		for(int i=0;i<sw;i++) {
			state[i]=sc.nextInt();
		}
		stu=sc.nextInt();
		for(int i=0;i<stu;i++) {
			sex=sc.nextInt();
			num=sc.nextInt();
			if (sex ==1) {
				for(int j=1;num*j<sw;j++)
				state[num*j]=~state[num*j];
			}else {
				
				
			}
		}
		
		
		
		//
		for(int i=0;i<sw;i++) {
			System.out.printf(state[i]+" ");
		}
		
	}

}
