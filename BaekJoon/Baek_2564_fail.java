import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2564_fail{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int W;
		int H;
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int N;
		int[] dir ,dist;
		int sDir,sDist;
		
		
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(br.readLine());
		dir = new int[N];
		dist = new int [N];
		int sum=0;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			dir[i] = Integer.parseInt(st.nextToken());//1 북 2남 3서 4 동
			dist[i] = Integer.parseInt(st.nextToken());//북남 -> 왼 서동 -> 위
		}
		st=new StringTokenizer(br.readLine());
		sDir =  Integer.parseInt(st.nextToken());
		sDist =  Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
		switch (sDir) {//경비가 어디쪽에 있는지
		case 1://북
			switch (dir[i]) {//가게가 어디있는지
			case 1:
				sum+=Math.abs(sDist-dist[i]);
				break;
			case 2:
				sum+=Math.min(H+sDist+dist[i],H+W-sDist+W-dist[i]);
				break;
			case 3:
				sum+=dist[i]+sDist;
				break;
			case 4:
				sum+=(W-sDist)+dist[i];
				break;

			default:
				break;
			}
			
			break;
		case 2://남
			switch (dir[i]) {//가게가 어디있는지 //1 북 2남 3서 4 동
			case 1:
				sum+=Math.min(H+sDist+dist[i],H+W-sDist+W-dist[i]);
				break;
			case 2:
				sum+=Math.abs(sDist-dist[i]);
				break;
			case 3:
				sum+=H-dist[i]+sDist;
				break;
			case 4:
				sum+=W-sDist+W-dist[i];
				break;

			default:
				break;
			}
			break;
		case 3://서
			switch (dir[i]) {//가게가 어디있는지
			case 1:
				sum+=sDist+dist[i];
				break;
			case 2:
				sum+=H-sDist+dist[i];
				break;
			case 3:
				sum+=Math.abs(sDist-dist[i]);
				break;
			case 4:
				sum+=Math.min(W+sDist+dist[i],H-sDist+H-dist[i]+W);
				break;

			default:
				break;
			}
			break;
		case 4://동
			switch (dir[i]) {//가게가 어디있는지 //1 북 2남 3서 4 동
			case 1:
				sum+=sDist+W-dist[i];
				break;
			case 2:
				sum+=H-sDist+W-dist[i];
				break;
			case 3:
				sum+=Math.min(W+sDist+dist[i],H-sDist+H-dist[i]+W);
				break;
			case 4:
				sum+=Math.abs(sDist-dist[i]);
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}
		
		
	}	
		System.out.println(sum);
	}
	

}