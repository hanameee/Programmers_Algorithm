package Level1;
//String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요.
//seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

public class FindKim {

	  public static String solution(String[] seoul) {
		  int index = 0;
		  for(int i=0; i<seoul.length; i++) {
			  if(seoul[i].equals("Kim")) {
				  //==하면 안되죠!! equals 해야죠!!
				  index = i;
			  }
		  }
	      String answer = "김서방은 "+index+"에 있다";
	      System.out.println(answer);
	      return answer;
	  }
	  
	public static void main(String[] args) {
		String[] seoul = {"Jane", "hello", "Kim"};
		solution(seoul);
		//김서방은 1에 있다
	}

}
