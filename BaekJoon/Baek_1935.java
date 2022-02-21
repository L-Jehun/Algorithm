import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class Baek_1935 {
	//1. 수업시간에 배운내용 후위 연산을 해보고싶었습니다.
	//2.
	//3. Stack을 적용하고 연산식대로 케이스를 나눠 적용하여 해결했다. 
 
    static int N;
    static int[] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public static void main(String[] args) throws NumberFormatException, IOException {
 
        N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        arr = new int[N];
 
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
 
        System.out.printf("%.2f", solution(str));
 
    }
 
    public static double solution(String input) {
 
        Stack<Double> st = new Stack<>();
        int len = input.length();
 
        for (int i = 0; i < len; i++) {
 
            char op = input.charAt(i);
 
            if (op >= 'A' && op <= 'Z') {
                st.push((double) arr[op - 'A']);
            } else {
 
                double op2 = st.pop();
                double op1 = st.pop();
                switch (op) {
 
                case '+':
                    st.push(op1 + op2);
                    break;
                case '-':
                    st.push(op1 - op2);
                    break;
                case '*':
                    st.push(op1 * op2);
                    break;
                case '/':
                    st.push(op1 / op2);
                    break;
                }
            }
        }
        return st.pop();
    }
}