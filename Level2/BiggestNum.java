package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNum {
	
    public static String solution(int[] numbers) {
    	//numbers 정수 배열을 string 배열로 바꿔준다
    	String[] nums = new String[numbers.length];
    	for(int i=0; i<nums.length; i++) {
    		nums[i] = String.valueOf(numbers[i]);
    	}
    	
    	
    	//compare 함수 오버라이드
    	Arrays.sort(nums, new Comparator<String>() {
    		@Override
    		public int compare(String s1, String s2) {
    			//내림차순으로 변경, 정렬기준 재정의
    			return ((s2+s1).compareTo(s1+s2));
    		}
    	});
    
    	//내림차순이므로 정렬했을 때 0으로 시작하면 다 0이란 소리 > 0000으로 프린트 되면 안되니깐!
    	//중복 불가라는 조건 없고, 0 안된다는 조건 없음
    	if(nums[0].equals("0")) {
    		return "0";
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(String num : nums) {
    		sb.append(num);
    	}
    	
        String answer = sb.toString();
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
