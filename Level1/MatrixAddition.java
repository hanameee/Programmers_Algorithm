//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

package Level1;

import java.util.Arrays;

public class MatrixAddition {
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length]; //행의갯수, 열의갯수
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3},{3,4}};
		int[][] arr2 = {{3,4},{5,6},{6,7}};
		
//		int[][] arr1 = {{1},{2}};
//		int[][] arr2 = {{3},{4}};
		
		solution(arr1,arr2);
		
		//return arr1			arr2			return
		//		 [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
	}

}
