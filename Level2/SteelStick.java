package Level2;
import java.util.Stack;

public class SteelStick {

    public static int solution(String arrangement) {
    	Stack<Character> stk = new Stack<Character>();
    	String arr = arrangement.replace("()", "0");
    	//레이저를 0으로 바꿔준다
    	int answer = 0;
    	
    	for(int i=0; i<arr.length(); i++) {
    		if (arr.charAt(i)=='(') {
    			stk.push('('); //(를 만나면 스택에 쌓는다
    		} else if (arr.charAt(i)=='0') { //레이저를 만나면 지금까지 쌓인 나무의 갯수+1만큼 답에 추가 (잘린 나무들 갯수)
    			answer += stk.size();
    		} else { // ')'를 만나면 나무막대기 하나가 빠지는 거니까! pop해준다
    			answer += 1;
    			stk.pop();
    		}
    	}
    	return answer;
    }
    
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		solution(arrangement);
	}

}
