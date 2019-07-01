package Level1;
//자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

public class Divisor {
	public static int solution(int n) {
		
		int answer = 0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i==0 && i!=Math.sqrt(n)) {
				answer+=i;
				answer+=(n/i);
			} else if(i==Math.sqrt(n)) {
				answer+=i;
			}
		}
		System.out.println(answer);
		return answer;
  }
	  
	public static void main(String[] args) {
		int n = 12;
		solution(n);
		//return : 28
	}

}
