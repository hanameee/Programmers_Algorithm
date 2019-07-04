package Level2;
import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumList {
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
    	Arrays.sort(phone_book, new Comparator<String>() {
    		@Override
    		public int compare(String s1, String s2) {
    			return s1.length()-s2.length();
    		}
    	});
    	
        for(int i=0; i<phone_book.length; i++) {
        	for(int j=i+1; j<phone_book.length; j++) {
//        		System.out.println(phone_book[i]+" "+phone_book[j].substring(0, phone_book[i].length()));
            	if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
            		answer = false;
            		System.out.println(answer);
            		return false;
            	}
        	}
        }      
		System.out.println(answer);
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"123","456","789"};
		solution(phone_book);
		//false (포함하니까)
	}

}
