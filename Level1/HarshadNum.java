//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
package Level1;



public class HarshadNum {
	
	public static boolean solution(int x) {
		int num = 0;
		String[] arr = String.valueOf(x).split("");
		for(String st : arr) {
			num += Integer.parseInt(st);
		}
//		int temp = x; //파라메터 값을 받아둔다.
//		
//		while(x!=0) {
//			num += x%10;
//			x = x/10;
//		}
//		
//		System.out.println(temp+"가"+num+"으로 나눠떨어지나요?");
//		System.out.println(temp%num);
	
		System.out.println(num);
		return (x%num==0)?true:false;
	}
	
	public static void main(String[] args) {
		int x = 1234;
		String[] arr = (x+"").split("");
		for(String i : arr) {
			System.out.println(i);
		}
		//result: true

	}

}
