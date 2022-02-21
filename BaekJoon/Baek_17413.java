import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_17413 {
	public static int T=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String S; // 문자열
		S= input.readLine();
		Stack st = new Stack();
		boolean ch =false;//<괄호체크>
		
		for(int i=0;i<S.length();i++) {
			//System.out.println(i);
			if(S.charAt(i)=='<') {
				swap(st);
				ch = true;
				System.out.print(S.charAt(i));
				}else if (S.charAt(i) == '>') {
					ch = false;
					System.out.print(S.charAt(i));
				}else if (ch) {
					System.out.print(S.charAt(i));//true 일때 걸려서 출력
				}
			else {
				if (S.charAt(i) == ' ') {
					swap(st);
					System.out.print(S.charAt(i));
				}

				else {
					st.push(S.charAt(i));
				}
			}
			
		}
		
		swap(st);
	}
	private static void swap(Stack st) {
		while(!st.empty()) {
			System.out.print(st.peek());
			st.pop();
			
		}
	}
	
}
