package Level1;

public class Days {
	public static String solution(int a, int b) {
    String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    int[] mth = {31,29,31,30,31,30,31,31,30,31,30,31};
    int day = 4;
    if(a!=1) {
    	for(int i=0; i<a-1; i++) {
        	day += mth[i];   		
    	}
    }
    day = day+b;
    String answer = days[day%7];

    return answer;
	  }
	
	public static void main(String[] args) {
		solution(2,1);
		int a = 10;
		a += 10;
		int b = 10;
		b =+ 10;
		System.out.println(a);
		System.out.println(b);

	}
}

