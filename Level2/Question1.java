package OnlineCodingTest;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 자연수가 들어있는 배열 arr가 매개변수로 주어집니다. 배열 arr안의 숫자들 중에서 앞에 있는 숫자들부터 뒤에 중복되어 나타나는 숫자들 중복 횟수를 계산해서 배열로 반환하도록 solution 함수를 완성해주세요. 만약 중복되는 숫자가 없다면 배열에 -1을 채워서 반환하세요.

입출력 예 #1
arr = [1, 2, 3, 3, 3, 4, 4]에서 3은 3번, 4는 2번씩 나타나므로 [3, 2]를 반환합니다.

입출력 예 #2
arr = [3, 2, 4, 4, 2, 5, 2, 5, 5]이면 2가 3회, 4가 2회, 5가 3회 나타나므로 [3, 2, 3]를 반환합니다.

입출력 예 #3
[3, 5, 7, 9, 1]에서 중복해서 나타나는 숫자는 없으므로 [-1]을 반환합니다.
*/
public class Question1 {
	
    public static int[] solution(int[] param) {
    	
    	Arrays.sort(param);
    	ArrayList<Integer> answer = new ArrayList<Integer>();
    	
    	boolean isSame = false; //중복되는 숫자가 있는지 여부
    	int now = param[0]; //현재 탐색중인 수
    	int cnt = 1;
    	for(int i=1; i<param.length; i++) {
    		if(now==param[i]) {
    			isSame = true;
    			cnt++;
    			now=param[i];
    			continue;
    		} else {
    			now=param[i];
    			if(cnt!=1) {
    				answer.add(cnt);	
    			}
    			cnt = 1;
    		}
    	}
    	
    	if(cnt!=1) {
    		answer.add(cnt);
    	}
    	
    	if(!isSame) {
    		int[] ans = {-1};
    		System.out.println(Arrays.toString(ans));
    		return ans;
    	}
    	

    	int[] ansArr = new int[answer.size()];
    	for(int i=0; i<answer.size(); i++) {
    	  ansArr[i] = answer.get(i).intValue();
    	}
    	System.out.println(Arrays.toString(ansArr));
        return ansArr;
    }
	public static void main(String[] args) {
		int[] param = {1, 2, 3, 3, 3, 3, 4, 4};
		solution(param);
	}

}
