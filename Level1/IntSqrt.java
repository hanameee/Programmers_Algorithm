package Level1;
//임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

public class IntSqrt {
	
	public static long solution(long n) {
		long answer = 0;
		if(Math.sqrt(n)%1.0==0.0) {
			answer = (long)Math.pow(Math.sqrt(n)+1, 2);
		} else {
			answer = -1;
		}
		System.out.println(answer);

		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 123;
		solution(n);
	}

}
