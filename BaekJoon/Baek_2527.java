import java.util.*;
import java.io.*;

class Baek_2527 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	for(int i=0;i<4;i++) {
    		st= new StringTokenizer(br.readLine());
    		int x1=Integer.parseInt(st.nextToken());
    		int y1=Integer.parseInt(st.nextToken());
    		int x2=Integer.parseInt(st.nextToken());
    		int y2=Integer.parseInt(st.nextToken());    		
    		int xx1=Integer.parseInt(st.nextToken());
    		int yy1=Integer.parseInt(st.nextToken());
    		int xx2=Integer.parseInt(st.nextToken());
    		int yy2=Integer.parseInt(st.nextToken());
    		
    		//점 선 X 면
    		if((x2==xx1 && y2==yy1) || (x2==xx1 && y1==yy2) || (x1==xx2 && y2== yy1)|| (x1==xx2 && y1==yy2)) {
    			System.out.println("c");
    		}
    		else if( (x2==xx1 && y2 != yy1) || (x1==xx2 && y2!=yy1) || (y1==yy2&& x2!=xx1) || (y1==yy2 && x1!=xx2) ) {
    			System.out.println("b");
    		}
    		else if(x2 < xx1 || x1 > xx2  || y2<yy1 || y1>yy2 ) {
    			System.out.println("d");
    		}else System.out.println("a");
    	}
    	
    }
}