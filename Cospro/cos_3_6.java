import java.util.ArrayList;

class cos_3_6 {
	public int solution(int n) {
        int answer = 0;
        int i, j, k;
        ArrayList<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (i = 3; i <= n; i += 2) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                prime.add(i);
            }
        }
        int prime_n = prime.size();
        for (i = 0; i < prime_n - 2; i++) {
            for (j = i + 1; j < prime_n - 1; j++) {
                for (k = j + 1; k < prime_n; k++) {
                    if (prime.get(i) + prime.get(j) + prime.get(k) == n) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }    
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    public static void main(String[] args) {
    	cos_3_6 sol = new cos_3_6();
        int n1 = 33;
        int ret1 = sol.solution(n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int n2 = 9;
        int ret2 = sol.solution(n2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}