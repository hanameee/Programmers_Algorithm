package Level1;
//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.


public class MakeStrangeNum {
	public static String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		String answer = "";
		
		String[] arr = new String[s.split(" ").length];
		arr = s.split(" ",-1);
		
		
		for(int a=0; a<arr.length; a++) {
			char[] carr = new char[arr[a].length()];
			for(int i=0; i<arr[a].length(); i++) {
				if(i%2==0) {
					carr[i] = Character.toUpperCase(arr[a].charAt(i));
				} else {
					carr[i] = Character.toLowerCase(arr[a].charAt(i));				
				}
			}
			arr[a] = new String(carr);
		}
		
		for(String word : arr) {
			answer+=word+" ";			
		}
		System.out.println(answer.substring(0, answer.length()-1));
		return answer.substring(0, answer.length()-1);
		}
	
//	public static String strangeWord(String s) {
//		char[] arr = new char[s.length()];
//		for(int i=0; i<s.length(); i++) {
//			if(i%2==0) {
//				arr[i] = Character.toUpperCase(s.charAt(i));
//			} else {
//				arr[i] = Character.toLowerCase(s.charAt(i));				
//			}
//		}
//		s = new String(arr);
//		return s;
//	}
	
	public static void main(String[] args) {
		String s = "try hello world";
//		strangeWord(s);
		solution(s);
//		result : TrY HeLlO WoRlD
	}

}
