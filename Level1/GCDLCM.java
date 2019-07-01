package Level1;
import java.util.ArrayList;
//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
//배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
//예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

public class GCDLCM {
	
	public static int[] solution(int n, int m) {
		
	    int[] answer = new int[2];
	    
	    int Snum = Math.min(n, m);
	    int Lnum = Math.max(n, m);
	    
	    int GCD = 0;
	    int LCM = 0;
	    //둘이 같으면?
	    
	    ArrayList<Integer> divList = new ArrayList<>();
	    
	    for(int i=1; i<=Math.sqrt(Snum); i++) {
	    	if(Snum%i==0 && i!=Math.sqrt(Snum)) {
	    		
	    		divList.add(i);
	    		divList.add(Snum/i);
	    		
	    	} else if(i==Math.sqrt(Snum)) {
	    		divList.add(i);
	    	}
	    } //작은 수의 약수 리스트 추가 완료
	    
	    for(int i : divList) {
		    System.out.println(i);
	    	while(i>GCD) {
	    		if(i%Lnum==0) {
	    			i = GCD;
	    		}
	    	}
	    }
 	    
	    System.out.println("출력되라아아아"+GCD);
	    return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 36;
		int m = 72;
		solution(n,m);
		//result: [1,10]
	}

}
