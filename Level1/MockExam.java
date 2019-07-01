package Level1;

import java.util.Arrays;
import java.util.ArrayList;

public class MockExam {

	public static int[] solution(int[] answers) {
	    
		ArrayList<Integer> answerList = new ArrayList<>();
		
    	int[] std1 = {1,2,3,4,5};
        int[] std2 = {2,1,2,3,2,4,2,5};
        int[] std3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = {0,0,0};
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i]==std1[i%5]) {score[0]++;}
        	if(answers[i]==std2[i%8]) {score[1]++;}
        	if(answers[i]==std3[i%10]) {score[2]++;}
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
       
        for(int i=0; i<score.length; i++) {
        	if(score[i]==max) {
        		answerList.add(i+1);
        	}
        }
        
        Integer[] answerInt = answerList.toArray(new Integer[answerList.size()]);
        int answer[] = Arrays.stream(answerInt).mapToInt(Integer::intValue).toArray();
        return answer;         

	}
	
	public static void main(String[] args) {
		int[] answers = {3,3,1,1,2,2,4,2};
		solution(answers);
	}	
 
}
