// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class cos_2_5 {
    public int solution(int[] arr) {
    	int answer =0;
    	int dp[] = new int [arr.length];
    	for(int i=0;i<dp.length;i++) {
    		
    		dp[i]=1;
    	}
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]>arr[i-1]) {
    			dp[i]=dp[i-1]+1;
    		}
    	}
    	for(int i=0;i<arr.length;i++) {
    		answer=Math.max(answer, dp[i]);
    	}
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	cos_2_5 sol = new cos_2_5();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}