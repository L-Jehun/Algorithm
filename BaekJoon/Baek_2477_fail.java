import java.util.*;
import java.io.*;

class Baek_2477_fail {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int cham;
    	int [][] line = new int[6][2];
    	int maxW = 0,maxH = 0;
    	int bigS = 0,smallS = 0;
    	cham = Integer.parseInt(br.readLine());
    	for(int i=0;i<6;i++) {
    		st = new StringTokenizer(br.readLine());
    		line[i][0]=Integer.parseInt(st.nextToken());
    		line[i][1]=Integer.parseInt(st.nextToken());

    		if(line[i][0]==3 || line[i][0]==4 ) {
    			if(maxH<line[i][1]) maxH=line[i][1];
    		}
    		if(line[i][0]==1 || line[i][0]==2 ) {
    			if(maxW<line[i][1]) maxW=line[i][1];
    		}
    		bigS=maxW*maxH;
    	}
    	int index=0;
    	for(int i=0;i<5;i++,index++) {
    		if((line[index][0]==1 && line[(index+1)%5][0]==3) || (line[index][0]==3 && line[(index+1)%5][0]==2) || (line[index][0]==2 && line[(index+1)%5][0]==4) || (line[index][0]==4 && line[(index+1)%5][0]==1)) {
    			smallS=line[index][1]*line[(index+1)%5][1];
    			
    		}
    	}
    	System.out.println((bigS-smallS)*cham);
    }
}