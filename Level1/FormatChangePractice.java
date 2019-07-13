package Level1;

import java.util.Arrays;

public class FormatChangePractice {

	public static void main(String[] args) {
		String string = "hello";
		String stringint = "12345";
		
		String[] stringArr = {"h","i"};
		StringBuilder sb = new StringBuilder("iamgroot");
		
		char ch = 'c';
		char[] chArr = {'c','h'};
		int integer = 123;
		int[] intArr = {1,2,3};
		
		// char > String
		String.valueOf(ch);
		Character.toString(ch);
		
		// int > String
		String.valueOf(integer);
		
		// sb > String
		sb.toString();
		
		// String > String[]
		string.split("");
		
		// String > char[]
		char[] stringcharArr = string.toCharArray();
		System.out.println(stringcharArr);
		
		// char[] > String
		System.out.println(Arrays.toString(chArr)); //배열을 그대로 문자열 형태로 출력 "[c, h]" chArr은 그대로
		System.out.println(String.valueOf(chArr)); //배열을 합쳐서 문자열 형태로 출력하기 - 유일하게 chArr만 된다!! 
		//String > integer
		Integer.parseInt(stringint); //리턴값이 int형
		Integer.valueOf(stringint); //리턴값이 Integer형 (wrapper class)
		
		
		// Integer > int
		Integer A = 1;
		int intA = A.intValue();
		
		//integer > char[]
		String intString = (integer+"");
		char[] intStringArr = intString.toCharArray();
		for(char i : intStringArr) {
			System.out.println(i);			
		}
		
		// intArr > String
		Arrays.toString(intArr); //intArr엔 변화 없음. 새로운 변수에 할당해줘야함. 
		System.out.println(Arrays.toString(intArr)); //배열을 문자열 형태로 출력하기 "[1, 2, 3]"
		
		String nullstring = "";
		for(int i : intArr) {
			nullstring += i;
		}
		System.out.println(nullstring); //배열을 합쳐서 문자열 형태로 출력하기
		// intArr > StringArr

	}

}
