package Level1;
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
public class intSum {
	  public static long solution(int a, int b) {
		  
		  if(a>b) Swap(a,b);
		  System.out.println(a);
	      long answer = 0;
		  for(int i=a; i<b+1; i++) {
			  answer += i;
		  }
		  
		  System.out.print(answer);
	      return answer;
	  }
	  
	  static void Swap(int a, int b) {
		  int temp = a;
		  a = b;
		  b = temp;
		  //이거 왜 안바뀜? 이 링크 참고해보자 https://gurchin.tistory.com/29
	  }
	  
	  public static void main(String[] args) {
		  solution(5,3);
	  }
}
