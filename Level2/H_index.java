package Level2;
import java.util.Arrays;

public class H_index {
	
    public static int solution(int[] citations) {

//    	Arrays.sort(citations);
//    	int answer = 0;
//    	for(int i=citations.length-1; i>=0; i--) {
//    		if(citations[i]<=citations.length-i) {
//    			answer = citations[i];
//				citations[i]는 촘촘하지 않잖아. index 값으로 가져가야 촘촘하게 움직이지!
//    			break;
//    		}
//    	}
//    	System.out.println(answer);
//        return answer;
    	
        int answer = 0;
        Arrays.sort(citations);
 
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
 
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = {22,42};
		solution(citations);
	}

}
