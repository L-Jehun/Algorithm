import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2999 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int R;
		int C;//R<C R*C=N
        char[] arr= word.toCharArray();
        int max =0;
        int roop = (int) Math.sqrt(word.length());
        
		for(int i=1;i<=roop;i++) {		
			R=i;
			C=word.length()/i;
			if(R*C==word.length() && R<=C) {
				if(max<R) max=R;
			}
		}

		if(word.length() == 1) {
			R=1; C=1;
		}else {
			R=max;
			C=word.length()/R;
		}
		
		 
		 
	     char[][] map = new char[R][C];
	     int index = 0;
	     
	        for (int i = 0; i < C; i++) {
	            for (int j = 0; j < R; j++) {
					map[j][i] = arr[index++];
	            }
	        }
	        
	 
	        for (int i = 0; i < R; i++) {
	            for (int j = 0; j < C; j++) {
	                System.out.print(map[i][j]);
	            }
	        }
		
	}

}
