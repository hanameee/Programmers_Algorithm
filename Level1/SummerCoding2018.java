package Level1;

import java.util.Arrays;

//부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
//최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

public class SummerCoding2018 {
	
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		int answer = 0;
		for(int i : d) {
			if(budget-i>=0) {
			budget -= i;
			answer++;
			}
		}
		System.out.println(answer);
	    return answer;
	}
	
	public static void main(String[] args) {
		int[] d = {2,2,3,3};
		int budget = 10;
		solution(d,budget);
		//result 3;
		
	}

}
