
/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
import java.util.Scanner;
import java.io.FileInputStream;

class swea_1873
{
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int H=sc.nextInt();//2 ≤ H, W ≤ 20
			int W=sc.nextInt();
			char [][]map=new char[H][W];
			for(int r=0;r<H;r++) {
					map[r]=sc.next().toCharArray();	
			}//맵 입력
			
			int com = sc.nextInt();//커맨드입력횟수
			char []comArr = new char[com];
			comArr=sc.next().toCharArray();
			//----------------------------------
			//int [][]dir = {{-1,0},{1,0},{0,-1},{0,1}};//상하좌우
			int[] dy = {-1,1,0,0};
			int[] dx = {0,0,-1,1};//상하좌우
			int dn = 0; //방향 배열번호
			int nr=0;
			int nc=0;
			int x=0,y=0;
			char dir = ' ';
			int sx,sy;
			//전차 위치저장
			for(int i = 0; i < H; i++) {
    			for(int j = 0; j < W; j++) {
	    			if(map[i][j] == '<' || map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '>') {
	    				y = i;
	    				x = j;
	    				dir = map[i][j];		
	    			}
    			}
    		}
			
			for (int i=0;i<com;i++) {//커맨드 개수만큼
				switch (comArr[i]) {
				case 'U':
					map[y][x]='^';
					dir='^';
					if(y - 1 >= 0 && map[y - 1][x] == '.') {
    					map[y - 1][x] = '^';
    					map[y][x] = '.';
    					y--;
    					dir = '^';
    				}
					break;
				case 'D':
					map[y][x] = 'v';
    				dir = 'v';
    				if(y + 1 < H && map[y + 1][x] == '.') {
    					map[y + 1][x] = 'v';
    					map[y][x] = '.';
    					y++;
    					dir = 'v';
    				}
    				break;
				case 'L':
					map[y][x] = '<';
    				dir = '<';
    				if(x - 1 >= 0 && map[y][x - 1] == '.') {
    					map[y][x - 1] = '<';
    					map[y][x] = '.';
    					x--;
    				}
    				break;
				case 'R':
					map[y][x] = '>';
    				dir = '>';
    				if(x + 1 < W && map[y][x + 1] == '.') {
    					map[y][x + 1] = '>';
    					map[y][x] = '.';
    					x++;
    					dir = '>';
    				}
					break;
				case 'S':					
					
					sy=y;
					sx=x;
					
					switch (dir) {
					case '^':
						dn=0;
						break;
					case 'v':
						dn=1;
						break;
					case '<':
						dn=2;
						break;
					case '>':
						dn=3;
						break;

					
					}
					
					
					while(true){
						if(sy+dy[dn] < 0 || sx+dx[dn] < 0 || sy+dy[dn] >= H || sx+dx[dn] >= W)//경계 확인.
							break;
						sy+=dy[dn];
						sx+=dx[dn];
						
						if(map[sy][sx]=='#') {//강철
							break;
						}
						else if(map[sy][sx]=='*') {//벽
							map[sy][sx]='.';
							break;
						}
					}
					break;
				
				}
			}
				
				
				
				System.out.print("#"+test_case+" ");
				for(int r=0;r<H;r++) {
				for(int c= 0;c<W;c++) {
					System.out.print(map[r][c]);
				}
				System.out.println();
			}
				
				
				
			}	
	}		
}