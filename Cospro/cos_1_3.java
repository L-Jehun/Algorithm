// You may use import as below.
//import java.util.*;

class cos_1_3 {
    public int solution(String pos) {
    	int dx[] = {1,1,-1,-1,2,2,-2,-2};
    	int dy[] = {2,-2,-2,2,1,-1,-1,1};
    	int posX = pos.charAt(0)-'A';
    	int posY = pos.charAt(1)-'0'-1;
    	int ans = 0;
    	for(int i=0;i<8;i++) {
    		int nx = posX+dx[i];
    		int ny = posY+dy[i];
    		if(nx>0 && ny>0 && nx<8 && ny<8) {
    			ans++;
    		}
    	}
		return ans;
    	
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	cos_1_3 sol = new cos_1_3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}