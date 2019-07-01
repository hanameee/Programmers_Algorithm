package Level1;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;

//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
public class DivideNum {
	  public static int[] solution(int[] arr, int divisor) {
		  
//		  int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//		  for(int i=0; i<answer.length; i++) {
//			  int max = answer[0];
//			  if(answer[i]>=max) {
//				  int temp = max;
//				 
//				  answer[i];
//			  }
//		  }
		  ArrayList<Integer> ansList = new ArrayList<>();
		  for(int i : arr) {
			  if(i%divisor==0) {
				  ansList.add(i);
			  }
		  }
		  int cnt = 0;
		  int[] answer = new int[ansList.size()];
		  for(int i : ansList) {
			  answer[cnt] = i;
			  cnt++;
		  }
		  
		  Arrays.sort(answer);
		  
		  for(int a : answer) {
			  System.out.print(a+" ");			  
		  }
  
		  for(int i : answer) {
			  System.out.println(i);  
		  }
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		  int[] arr = {2,36,1,3};
		  int divisor = 1;
		  solution(arr,divisor);
	  }
}


