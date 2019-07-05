package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//A = [1, 4, 2] , B = [5, 4, 4] 라면
//최솟값 29
public class MakeMin {
	
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        ArrayList<Integer> Blist = new ArrayList<>();
        for(int i : B) {
            Blist.add(i);       	
        }
        Collections.reverse(Blist);
        for(int i=0; i<Blist.size(); i++) {
        	B[i] = Blist.get(i).intValue();
        }
        

        for(int i=0; i<A.length; i++){
        	answer += A[i]*B[i];
        }
     
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
//
//        System.out.println(answer);
        return answer;
    }
   
    
    
	public static void main(String[] args) {
		
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		
		solution(A,B);

		
	}

}

