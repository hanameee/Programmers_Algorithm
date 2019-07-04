package Level2;

import java.util.Arrays;

//두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
//예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
//n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

public class Nlcm {
	
	public static int solution(int[] arr) {
		Arrays.sort(arr);
		int powNum = 1;
		int LCM = arr[arr.length-1]*powNum;
		
		while(!isDivided(LCM,arr)) {
			//LCM 증가시키기
			powNum++;
			LCM = arr[arr.length-1]*powNum;
			
			System.out.println("지금 LCM은"+LCM);
			
		}
		
	    System.out.println(LCM);
	    return LCM;
	}
	
	public static boolean isDivided(int LCM,int[] arr) {
		boolean answer = true;
		for(int i : arr) {
			answer = true;
			if(LCM%i!=0) {
				return false;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		solution(arr);
		//168
		// TODO Auto-generated method stub

	}

}
