//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

//5 3
package Level2;
import java.util.Arrays;

public class Exam {
//	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        for(int i=0; i<b; i++) {
//        	for(int j=0; j<a; j++) {
//        		System.out.print("*");
//        	}
//        	System.out.println();
//        }
//    }	
    public static int[] solution(int[][] v) {
    	int[] answer = new int[2];
//    	for(int i=0; i<answer.length; i++) {
//         	if(v[0][i]==v[1][i]) { //1,2가 같은 x를 가지고 있으면
//         		answer[i] = v[2][i]; //나머지 한 x는 3이랑 동일
//         	} else if(v[0][i]==v[2][i]) {
//         			answer[i] = v[1][i];
//         	} else if(v[1][i]==v[2][i]){
//         			answer[i] = v[0][i];
//         		}
//         	}
    	
     	if(v[0][0]==v[1][0]) { //1,2가 같은 x를 가지고 있으면
     		answer[0] = v[2][0]; //나머지 한 x는 3이랑 동일
     	} else {
     		if(v[0][0]==v[2][0]) {
     			answer[0] = v[1][0];
     		} else {
     			answer[0] = v[0][0];
     		}
     	}
    	
     	if(v[0][1]==v[1][1]) { //1,2가 같은 x를 가지고 있으면
     		answer[1] = v[2][1]; //나머지 한 x는 3이랑 동일
     	} else {
     		if(v[0][1]==v[2][1]) {
     			answer[1] = v[1][1];
     		} else {
     			answer[1] = v[0][1];
     		}
     	}
    	System.out.print(Arrays.toString(answer));
        return answer;
    }
    
	public static void main(String[] args) {
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		solution(v);
	}
	
}
