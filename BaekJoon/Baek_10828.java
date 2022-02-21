import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_10828{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st= new Stack<Integer>();
		int N= Integer.parseInt(br.readLine());
		String[] com;
		for(int i=0;i<N;i++) {
			com=br.readLine().split(" ");
			switch (com[0]) {
			case "push":
				st.push(Integer.parseInt(com[1]));
				break;
			case "pop":
				if(st.empty())System.out.println("-1");
				else {
					System.out.println(st.peek());
					st.pop();
				}
				break;
			case "size":
				System.out.println(st.size());
				break;
			case "empty":
				if(st.empty())System.out.println("1");
				else System.out.println("0");
				break;
			case "top":
				if(st.empty())System.out.println("-1");
				else System.out.println(st.peek());
				break;
			}
		}
		
	}	
}