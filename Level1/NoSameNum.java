package Level1;
import java.util.ArrayList;
import java.util.Arrays;


//배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

public class NoSameNum {
	public static int[] solution(int []arr) {
		ArrayList<Integer> array = new ArrayList();
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				array.add(arr[i]);
			}
		}
        
		if(arr[arr.length-1] != arr[arr.length-2]) {
			array.add(arr[arr.length-1]);
		}
        
		Integer[] integerArray = array.toArray(new Integer[array.size()]);
		int[] answer = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
		//위 두줄 코드로 Integer ArrayList를 int array로 바꿀 수 있다! 어머 근데 시간이 왜이렇게 오래걸리니...
		
//      int cnt = 0;
//      int[] answer = new int [array.size()];
//		for(int i : array) {
//			answer[cnt] = i;
//			cnt++;
//      }
//		
//		for(int i : answer) {
//			System.out.print(i);
//		}
		
        return answer;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,1,2,2,2,9,8,8,3,4,5,6,6};
		solution(arr);
	}
}

