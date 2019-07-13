package Level1;
import java.util.ArrayList;
import java.util.Arrays;

//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//(1은 소수가 아닙니다.)
public class FindPrime {
	
	  public static int solution(int n) {
		  int answer = 0;
		  boolean[] isPrime = new boolean[n+1];
		  for(int i=2; i<=n; i++) {
			  isPrime[i] = true;
		  }
		  
		  
		  for(int i=2; i<=Math.sqrt(n); i++) {
			  if(isPrime[i] == false) {
				  continue;
			  }
			  for(int j=i*2; j<=n; j+=i) {
				  isPrime[j] = false;
			  }
		  }
		  
		  for(boolean b : isPrime) {
			  if(b==true) {
				  answer++;
			  }
		  }
		  System.out.println(answer);
	      return answer;     
	 }
	  
	  
	  public static void main(String[] args) {
		  int n = 10;
		  String test = "hello";
		  System.out.println(test+n);
		  System.out.println(n+test);
		  
//		  solution(n);
		  //result = 4;
	  }
}
