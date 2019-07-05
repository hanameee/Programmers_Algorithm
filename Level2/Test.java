package Level2;

import java.util.Arrays;


//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
//commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

public class Test {
	
    public static int solution(int n, int[] lost, int[] reserve) {
    	int[] clothes = new int[n];
    	Arrays.fill(clothes, 1);
    	for(int i : reserve) {
    		clothes[i-1]++;
    	}
    	
    	for(int i : lost) {
    		clothes[i-1]--;
    	}
    	
    	int answer = 0;
    	for(int i : clothes) {
    		if(i!=0) {
    			answer++;
    		}
    	}
    	for(int i=0; i<clothes.length; i++) {
    		System.out.println("현재 i는 "+i);
    		if(i!=clothes.length-1 && clothes[i]==0 && clothes[i+1]==2) {
    			clothes[i+1]--;
    			clothes[i]++;
    			answer++;
    			System.out.println(i+"가 오른쪽 애한테 빌림");
    		} else if(i!=0 && clothes[i]==0 && clothes[i-1]==2) {
    			clothes[i-1]--;
    			clothes[i]++;
    			answer++;
    			System.out.println(i+"가 왼쪽 애한테 빌림");
    		} else {			
    		}
    	}
    	
    	System.out.println(answer);
        return answer;
    }
    
    public static void main(String[] args) {
    	int n = 5;
    	int[] lost = {2,4};
    	int[] reserve = {3};
    	solution(n,lost,reserve);
    	//5
    }
}
