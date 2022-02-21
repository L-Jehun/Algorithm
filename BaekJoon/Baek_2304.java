import java.util.*;
import java.io.*;

class Baek_2304 {
	
	static class pos implements Comparable<pos>{
		int x;
		int y;
		public pos(int x,int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(pos o) {
			// TODO Auto-generated method stub
			return this.x-o.x;
		}		
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int N = Integer.parseInt(br.readLine());//기둥 개수
    	ArrayList<pos> arr = new ArrayList<>();
    	int maxY =0;
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		arr.add(new pos(x,y));
    	}
    	pos temp;
    	int sum = 0;
    	Collections.sort(arr); //arr.get(i).x sysout 2 4 5 8 11 13 15
    	temp=arr.get(0);
    	for(int i=0;i<N;i++) {
    		if(temp.y<=arr.get(i).y) {
    			sum += (arr.get(i).x - temp.x) * temp.y;
    			temp = arr.get(i);
    			maxY =i; //인덱스 저장.
    		}
    	}
    	temp = arr.get(N-1);
    	for(int i=0;i<N-maxY;i++) {
    		if(temp.y<=arr.get((N-1)-i).y){
    			sum+= (temp.x-arr.get(N-1-i).x)*temp.y;
    			temp = arr.get((N-1)-i);
    		}
    		
    	}
    	sum+=temp.y;
    	System.out.println(sum);
    }
   
}