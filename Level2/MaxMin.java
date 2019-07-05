package Level2;

import java.util.Arrays;
import java.util.Comparator;

//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
//str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.

public class MaxMin {
	
	public static String solution(String s) {
		String[] arr = s.split(" ");
		int[] intarr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			intarr[i] = Integer.parseInt(arr[i]);
		}

		Arrays.sort(intarr);
		System.out.println(Arrays.toString(intarr));
	    StringBuilder sb = new StringBuilder();
	    sb.append(intarr[0]+" "+intarr[arr.length-1]);
	    System.out.println(sb.toString());
	    return sb.toString();
	}
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		solution(s);

		
	}

}
