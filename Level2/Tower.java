package Level2;

import java.util.Arrays;

public class Tower {
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i=answer.length-1; i>0; i--) {
        	for(int j = i-1; j>=0; j--) {
        		if(heights[j]>heights[i]) {
        			answer[i]=j+1;
        			break;
        		}
        	}
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
		solution(heights);
		
		//result [0,0,2,2,4]
	}
}
