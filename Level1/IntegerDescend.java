package Level1;

import java.util.Arrays;
import java.util.Collections;

//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//예를들어 n이 118372면 873211을 리턴하면 됩니다.

public class IntegerDescend {
	
	public static long solution(long n) {
		StringBuilder sb = new StringBuilder();
		
		long answer = 0;
		String ans = n+"";

//		int[] arr = new int[ans.length()];
//		for(int i=0; i<ans.length(); i++) {
//			arr[i] = Character.getNumericValue(ans.charAt(i));
//		}
//		
		char[] arr = new char[ans.length()];
		for(int i=0; i<ans.length(); i++) {
			arr[i] = ans.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for(char i : arr) {
			sb.append(i);
		}
		
		String temp = sb.reverse().toString();
		answer = Long.parseLong(temp);
		

		System.out.println(answer);


		return answer;
		
		}
	
	public static void main(String[] args) {
			long n = 118372;
			solution(n);
			//result 873211

		// TODO Auto-generated method stub

	}

}

