package Level2;

import java.util.*;


public class TowerUsingStack {
	
	    class Tower {
	    	//멤버변수 (인덱스, 높이)
	        int idx;
	        int height;
	        
	        //생성자 함수
	        public Tower(int idx, int height) {
	            this.idx = idx;
	            this.height = height;
	        }

	        @Override
	        public String toString() {
	            return "idx : " + idx + " height : " + height;
	        }
	    }

	    public int[] solution(int[] heights) {
	    	
	    	//Tower class를 객체로 가지는 Stack 생성 
	        Stack<Tower> st = new Stack<>();
	        //답을 리턴할 answer 배열 생성
	        int[] answer = new int[heights.length];
	        
	        //매개변수로 주어진 heights 배열에 대해 (각각의 탑들에 대해)
	        for (int i = 0; i < heights.length; i++) {
	        	//탑의 인덱스는 배열과는 달리 1부터 시작하므로, 해당 탑을 tower객체로 만들어준다
	            Tower tower = new Tower(i + 1, heights[i]);
	            //수신하는 탑의 인덱스
	            int receiveIdx = 0;
	            
	          //스택이 차있다면 (i=1부터는)
	            while (!st.isEmpty()) {
	            	//stack 의 맨 위 요소 = top으로 만들어준다
	                Tower top = st.peek();

	                if (top.height > tower.height) { //지금 탐색하는 tower보다 이전에 스택에 들어있던 애의 height이 크다면
	                    receiveIdx = top.idx; //수신하는 탑의 index를 top으로 바꿔준다
	                    break;
	                }
	                
	                //if문에 들어가지 않았다면(이전에 스택에 들어있던 애의 height이 크지 않다면) pop해준다
	                st.pop();
	            }
	            
	            //새롭게 만든 tower 객체를 넣어준다
	            st.push(tower);
	            //첫번째 탑은 수신하는 탑이 없으므로 answer[0]은 default인 0값을 가지게 된다
	            answer[i] = receiveIdx;
	        }

	        return answer;
	    }
	    
		public void main(String[] args) {
			int[] heights = {6,9,5,7,4};
			solution(heights);
			
			//result [0,0,2,2,4]
		}
	    
	
}

