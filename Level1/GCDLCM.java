package Level1;
import java.util.ArrayList;
import java.util.Collections;
//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
//배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
//예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

public class GCDLCM {
	
	public static int[] solution(int n, int m) {
		
	    int[] answer = new int[2]; //최대공약수, 최소공배수를 넣어 리턴할 배열
	    
	    int Snum = Math.min(n, m);
	    int Lnum = Math.max(n, m);
	    
	    answer[0] = gcd(Lnum,Snum);
	    answer[1] = Lnum*Snum/answer[0];
	    
//	    int GCD = 0;
//	    int LCM = 0;
//	    //둘이 같으면?
//	    
//	    ArrayList<Integer> divList = new ArrayList<>();
//	    
//	    for(int i=1; i<=Math.sqrt(Snum); i++) {
//	    	if(Snum%i==0 && i!=Math.sqrt(Snum)) {
//	    		
//	    		divList.add(i);
//	    		divList.add(Snum/i);
//	    		
//	    	} else if(i==Math.sqrt(Snum)) {
//	    		divList.add(i);
//	    	}
//	    } //작은 수의 약수 리스트 추가 완료
//	   
//	    
//	    Collections.sort(divList); //List를 sort 하는 방법! Collections.sort를 쓴다
//	    for(int i=divList.size()-1; i>=0; i--) {
//	    	if(Lnum%divList.get(i)==0) {
//	    		GCD = divList.get(i); //최대를 구해야 하니, 정렬해두고 뒷쪽 인덱스부터 순회하면서 나오자마자 break!
//	    		break;
//	    	}
//	    }
//	    
//	   LCM = (Lnum%GCD)*Snum;
	   for (int i : answer) {
		   System.out.println(i);
	   }
	   return answer;
	}
	
	public static int gcd(int p, int q) {
		
//		if(p%q==0) {
//			return q;
//		} else {
//			return gcd(q,p%q);
//		}
		
		if(q==0) {
			return p;
		} else {
			return gcd(q,p%q);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int m = 63;
		solution(n,m);
		//result: [1,10]
	}

}
