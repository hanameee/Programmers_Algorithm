package Level1;

public class MidChar {
	
	public static String solution(String s) {
		String answer = "";
    	int charLen = s.length();
    	if(charLen%2==1) {
    		answer = s.substring(charLen/2, (charLen/2)+1);
    	} else {
    		answer = s.substring((charLen/2)-1, (charLen/2)+1);    		
    	}
    	System.out.println(answer);
    	return answer;
	}
	
    public static void main(String[] args) {
    
    	String a = "123456";
    	solution(a);
    	
    }
}
