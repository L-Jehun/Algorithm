

import java.util.Scanner;

public class swea_1244 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sw;//스위치 개수
		sw =sc.nextInt();
		int []state = new int [sw+1]; //스위치 상태
		int stu;//학생수 1남 배수 스위치 상태 바꿈    2녀 좌우 대칭확인->구간 스위치 다 바뀜
		int sex;
		int num;
		int step=1;
		for(int i=1;i<=sw;i++) {
			state[i]=sc.nextInt();
		}
		stu=sc.nextInt();
		for(int i=0;i<stu;i++) {
			sex=sc.nextInt();
			num=sc.nextInt();
			if (sex ==1) {
				for(int j=1;num*j<sw;j++)
				state[num*j] = state[num*j] == 0 ? 1 : 0;
			}else {
				while(true) {
					if(step==1) state[num]=state[num] == 0 ? 1 : 0;
					if(state[num-step]==state[num+step]) {
						state[num-step]=state[num-step] == 0 ? 1 : 0;
						state[num+step]=state[num+step] == 0 ? 1 : 0;
						step++;
					}else {
						if(step==1) {
							state[num]=state[num] == 0 ? 1 : 0;
						}
						break;
					}
				}
				
			}
		}
		for(int i=1;i<=sw;i++) {
			System.out.printf(state[i]+" ");
		}
		
	}

}
