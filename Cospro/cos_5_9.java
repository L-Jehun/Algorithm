// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class cos_5_9 {
	public int solution(int number, int target) {
		int answer = 0;
		while (number!=target) {
			if(number+1==target) {
				number++;
				answer++;
				break;
				
			}else if(number-1==target){
				number--;
				answer++;
				break;
			}else if(number<target) {
				number=number*2;
				answer++;
				System.out.println(answer);
			}
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		cos_5_9 sol = new cos_5_9();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}