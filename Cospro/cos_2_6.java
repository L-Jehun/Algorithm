// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class cos_2_6 {
    public int[] solution(String commands) {
        // 여기에 코드를 작성해주세요.
    	int pos[]= {0,0};
    	char[] arr =commands.toCharArray();
    	for(int i=0;i<arr.length;i++) {
    		
    		switch (arr[i]) {
    		
    		case 'U':
    			System.out.println("U");
    			pos[1]+=1;
    			System.out.println(pos[0]+" "+pos[1]);
    			break;
			case 'D':
    			System.out.println("D");
    			pos[1]-=1;			
    			System.out.println(pos[0]+" "+pos[1]);
			    break;
			case 'R':
    			System.out.println("R");
    			pos[0]+=1;
    			System.out.println(pos[0]+" "+pos[1]);
				break;
			case 'L':
    			System.out.println("L");
    			pos[0]-=1;
    			System.out.println(pos[0]+" "+pos[1]);
				break;
	
    		}
    	}
        int[] answer = { pos[0],pos[1]};
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        cos_2_6 sol = new cos_2_6();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}