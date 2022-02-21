

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_3499 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			sb.append("#").append(test_case).append(" ");
			
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			//---------------------------------------
			String[] cardL = new String[(N / 2) + 1];
			String[] cardR = new String[N / 2 + 1];
			int j = 0;
			for (int i = 0; i < N; i++) {
				if (i == N / 2 && N % 2 == 1) {
					cardL[i] = st.nextToken();
				} else if (i < N / 2) {
					cardL[i] = st.nextToken();
				} else {
					cardR[j++] = st.nextToken();
				}
			}
			
			
			for (int i = 0; i < N / 2; i++) {
				sb.append(cardL[i]).append(" ").append(cardR[i]).append(" ");
			}
			if (N % 2 == 1) {
				sb.append(cardL[N / 2]);
			}
			sb.append("\n");
		}
		//---------------------------------------------
		System.out.print(sb);
	}
}