package Level1;
import java.util.Arrays;
//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//n은 10,000,000,000이하인 자연수입니다.
public class NaturalNumReverse {
	
	public static int[] solution(long n) {
		int cnt = 0;
		long testN = n;
		while(testN>=1) {
			testN = testN/10;
			cnt++;
		}
		String strN = n+"";
		int[] answer = new int[cnt];
		for(int i=0; i<cnt; i++) {
			answer[answer.length-1-i] = Character.getNumericValue(strN.charAt(i));
		}
//		for(int i : answer) {
//			System.out.println(i);			
//		}
		return answer;
  }
	public static void main(String[] args) {
		long n=12345;
		solution(n);

	}

}
