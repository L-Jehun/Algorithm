import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;
 
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 
public class Baek_15686 {
    static int N, M;
    static int[][] map;
    static ArrayList<Point> house;
    static ArrayList<Point> chicken;
    static int ansMin;
    static boolean[] open;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
 
        map = new int[N][N];
        house = new ArrayList<>();
        chicken = new ArrayList<>();
 
        // 미리 집과 치킨집에 해당하는 좌표를 ArrayList에 넣어 둠.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
 
                if (map[i][j] == 1) {
                	house.add(new Point(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }
 
        ansMin = Integer.MAX_VALUE;
        open = new boolean[chicken.size()];
 
        DFS(0, 0);
        bw.write(ansMin + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void DFS(int start, int cnt) {
    	if(cnt==M) {
    		int res=0;
    		
    		for(int i=0; i<house.size();i++) {
    			int min = Integer.MAX_VALUE;
    			for(int j=0; j<chicken.size();j++) {
    				if(open[j]) {
    					int dist = Math.abs(house.get(i).x - chicken.get(j).x)+Math.abs(house.get(i).y-chicken.get(j).y);
    					min = Math.min(min, dist);
       				}
    			}
    			res += min;
    		}
    		ansMin = Math.min(ansMin, res);
    		return;
    	}
    	for (int i = start; i < chicken.size(); i++) {
            open[i] = true;
            DFS(i + 1, cnt + 1);
            open[i] = false;
        }
    	
    }
}