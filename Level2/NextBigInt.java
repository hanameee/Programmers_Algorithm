package Level2;

//자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
//
//조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.

public class NextBigInt {
	
	public static int solution(int n) {
		
		int target = numOfOne (n);
		int answer = n+1;
		while(numOfOne(answer)!=target) {
			answer++;
		}
		System.out.println(answer);
	    return answer;
	}
	
	public static int numOfOne(int n) {
		int cnt = 0;
		String bi = Integer.toBinaryString(n);
		for(int i=0; i<bi.length(); i++) {
			if(bi.charAt(i)=='1') {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int n = 78;
		solution(n);
		//83

	}

}
