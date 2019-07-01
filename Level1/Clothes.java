package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Clothes {
	
    public static int solution(int n, int[] lost, int[] reserve) {
        //진짜 lost인 애들 간추리기 (여벌 가져온 애들 제외)
//        ArrayList<Integer> lostStd = new ArrayList<>();
//        
//        
//        for (int i : lost) {
//        	lostStd.add(i);
//        }
//        
//        for(int i : lost) {
//        	for(int j=0; j<reserve.length; j++) {
//        		if(i==reserve[j]) {
//        			lostStd.remove(lostStd.indexOf(i));
//        		}
//        	}
//        }
        
        int[] clothes = new int[n];
        Arrays.fill(clothes, 1);
        //체육복 갯수 1로 초기화
        
        for(int i : lost) {
        	clothes[i-1]--;
        }
        //잃어버린 학생들은 하나 더 줄인다
        
        for(int i : reserve) {
        	clothes[i-1]++;
        }
        //여유 있는 애들은 하나 더 늘린다 
        
        
//        for(int i : clothes) {
//        	System.out.println(i);
//        }
 
        int answer = 0;
        
        for(int i=0; i<clothes.length; i++) {
        	if(clothes[i] == 0) {
        		if(i!=(clothes.length-1) && clothes[i+1]==2) {
        			clothes[i+1]=1;
        			answer++;
        		} else if(i!=0 && clothes[i-1]==2) {
        			clothes[i-1]=1;
        			answer++;
        		}
        	}
        	else {
        		answer++;
        	}
        }
        return answer;
    }	
	
    public static void main(String[] args) {
    	int n = 7;
    	int[] lost = {3,5};
    	int[] reserve = {3,6};
    	
    	solution(n,lost,reserve);
    }

}
