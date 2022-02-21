import java.util.*;
import java.io.*;

class Baek_2491 {
    

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(); //N 길이 수열
        int [] num = new int [N];
        int bigCnt=1,smallCnt =1;
        int max=1;
        
        for(int i=0;i<N;i++) {
        	num[i]= sc.nextInt(); // 입력        	
        }
        for(int i =0; i< N-1 ; i++) {
        	if(num[i]<=num[i+1]) bigCnt++;
        	else bigCnt = 1;
        	if(max<bigCnt) max =bigCnt;
        }
        for(int i =0; i< N-1 ; i++) {
        	if(num[i]>=num[i+1]) smallCnt++;
        	else smallCnt = 1;
        	if(max<smallCnt) max =smallCnt;
        }
        System.out.println(max);
       
       
            
    }
}