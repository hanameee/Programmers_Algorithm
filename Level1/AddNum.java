package Level1;
//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
public class AddNum {
    public static int solution(int n) {
    	int cnt = 0;
    	int answer = 0;
    	
    	int testN = n;
    	while(testN>=1) {
    		testN = testN/10;
    		cnt++;
    	}
    	
    	String ans = n+"";
    	
    	for(int i=0; i<cnt; i++) {
    	answer += Character.getNumericValue(ans.charAt(i));
    	}
    	
    	System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		int n = 1234;
		solution(n);

	}

}