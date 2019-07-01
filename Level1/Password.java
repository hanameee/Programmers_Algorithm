package Level1;

public class Password {
	
	public static String solution(String s, int n) {
	      StringBuilder sb = new StringBuilder();
	      int[] chArr = new int[s.length()];
	      for(int i=0; i<s.length(); i++) {
	    	 chArr[i] = (int)s.charAt(i);  
	    	 if(chArr[i]==32) {
	    		 continue;
	    	 } else if(chArr[i] <=90 && chArr[i]+n>90) {
	    		 chArr[i]= chArr[i]+n-26;
	    	 } else if (chArr[i] >=97 && chArr[i]+n>122) {
	    		 chArr[i] = chArr[i]+n-26;
	    	 } else {
	    		 chArr[i] = chArr[i]+n;
	    	 }
	      }
	      
	      for(int i : chArr) {
	    	  sb.append((char)i);
	      }
	      
	      String answer = sb.toString();
	      return answer;
	}
	
	
	public static void main(String[] args) {
		String s = "z";
		int n = 1;
		solution(s,n);
		//e F d;
	}

}
