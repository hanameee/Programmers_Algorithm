package Level1;
import java.util.ArrayList;
import java.util.Arrays;

//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.


public class DeleteMin {
	
	public static int[] solution(int[] arr) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		if(arr.length==1) {
			
			int[] answer = {-1};

			return answer;
			
		} else {
			
			for(int i : arr) {
				intList.add(i);
			}
			
			int min = arr[0];
			for(int i=0; i<arr.length-1; i++) {
				if(min>Math.min(arr[i], arr[i+1])) {
					min = Math.min(arr[i], arr[i+1]);
				}
			}
			
			
			System.out.println("min은 "+min+" 입니다.");
			System.out.println(intList.indexOf(min)+"을 제거합니다");
			intList.remove(intList.indexOf(min));
			Integer[] answerArr = intList.toArray(new Integer[intList.size()]);
			
			int[] answer = Arrays.stream(answerArr).mapToInt(Integer::intValue).toArray();
			for(int i : answer) {
				System.out.println(i);				
			}

	        return answer;
		}

	}
	
	public static void main(String[] args) {
		int[] arr = {-1,-2,0,5};
		solution(arr);
	}

}
