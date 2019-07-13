//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
//x는 -10000000 이상, 10000000 이하인 정수입니다.
//n은 1000 이하인 자연수입니다.

package Level1;

import java.util.Arrays;

public class XintervalNnum {
	
	public static long[] solution(int x, int n) {
	    long[] answer = new long[n];
	    answer[0] = x;
	    for(int i=1; i<n; i++) {
	    	answer[i] = answer[i-1]+x;
	    }
	    return answer;
//	    if(x!=0) {
//		    for(int i=0; i<n; i++) {
//		    	answer[i] = x*(i+1);
//		    }
//		    System.out.println(Arrays.toString(answer));
//		    return answer;	    	
//	    } else {
//	    	Arrays.fill(answer,0);
//		    System.out.println(Arrays.toString(answer));
//	    	return answer;
//	    }
	}
	
	public static void main(String[] args) {
		int x = 0;
		int n = 5;
		solution(x,n);
		//[4,8,12]

	}

}
