//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
package Level1;

public class HidePhoneNum {
	
	public static String solution(String phone_number) {
		char[] arr = phone_number.toCharArray();
		for(int i=0; i<arr.length-4; i++) {
			arr[i] = '*';
		}
		// return arr.toString(); 하면 안된다!! 고유값 나옴
		System.out.println(String.valueOf(arr));
		return String.valueOf(arr);

//		StringBuilder sb = new StringBuilder(phone_number);
//		for(int i=0; i<sb.length()-4; i++) {
//			sb.replace(i, i+1, "*");
//		}
//		System.out.println(sb.toString());
//		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
