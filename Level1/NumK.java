package Level1;

import java.util.Arrays;
//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

public class NumK {
    public static int[] solution(int[] array, int[][] commands) {
       
    	int[] answer = new int[commands.length];
    	
    	for(int a=0; a<commands.length; a++) {
        	
        	int i = commands[a][0];
        	int j = commands[a][1];
        	int k = commands[a][2];
        	
//        	System.out.println(i);
//        	System.out.println(j);
//        	System.out.println(k);
        	
    		int[] ans = new int[j-i+1];
    		
    		int cnt = 0;
        	for(int b=(i-1); b<j; b++) {
        		ans[cnt] = array[b];
        		cnt++;
        	}
  
        	for(int o : ans) { 
        		System.out.print(o);
        	}
        	
        	Arrays.sort(ans);

        	
        	answer[a]= ans[k-1];
        	System.out.println();
        }
    	
    	for(int i : answer) { 
    		System.out.println(i);
    	}
    	
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] array = {1, 5, 2, 6, 3, 7, 4};
    	int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    	
    	solution(array,commands);
    	
    }
}
