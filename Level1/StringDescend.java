//문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringDescend {
	  public static String solution(String s) {
	      String answer = "";
	      ArrayList<String> upperList = new ArrayList<>();
	      ArrayList<String> lowerList = new ArrayList<>();

	      for(int i=0; i<s.length(); i++) {
	    	  char ch = s.charAt(i);
	    	  
	    	  if(Character.isUpperCase(ch)) {
	    		  String st = Character.toString(ch);
	    		  upperList.add(st);
	    	  } else {
	    		  String st = Character.toString(ch);
	    		  lowerList.add(st);
	    	  }
	      }
	      
	      Collections.sort(upperList, new DescendingString());
	      Collections.sort(lowerList, new DescendingString());
	      
	      ArrayList<String> list = new ArrayList<String>(lowerList);
	      list.addAll(upperList);
	      
	      for(String i : list) {
		      answer += i; 	    	  
	      }

	      System.out.println(answer);
	      return answer;
	  }
	  
//	  public static void main(String[] args) {
//		  String s = "Zbcdefg";
//		  solution(s);
//		  //gfedcbZ
//	  }
}

class DescendingString implements Comparator<String> {
	@Override public int compare(String a, String b) {
		return b.compareTo(a);
		}
	}
