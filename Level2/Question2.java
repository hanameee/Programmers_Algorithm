package OnlineCodingTest;
//배열 arr1과 arr2가 주어집니다. 
//각 배열의 원소는 숫자 1부터 9까지로 이루어져 있습니다. 
//이 배열에서 2번 이상 페어로 나오는 숫자들을 비교해서 둘 중에 어느 쪽이 더 큰 값인지 확인해야 합니다. 
//arr1 배열이 더 큰 값을 포함하면 1을, arr2 배열이 더 큰 값을 포함하고 있으면 2를 return 하는 solution 함수를 완성해 주세요.
//양쪽 배열에 모두 페어가 없으면 0을 return 하세요.
//같은 숫자 2개가 페어로 나오는 경우보다는 *3개가 페어로 나오는 경우가 더 큰 값이다.
//같은 숫자 3개가 페어로 나오는 경우보다는 *4개가 페어로 나오는 경우가 더 큰 값이다.
//5개 이상 같은 수가 반복되면 4개와 같은 크기로 취급한다.
//양쪽 모두 같은 개수의 페어라면 더 *큰 숫자가 큰 값이다.
//숫자 페어가 2벌이 나오는 경우에는 *더 큰 숫자로 되어있는 페어만 고려한다.
//양쪽 배열에서 페어 숫자가 같으면 비교를 할 수 없으니 0을 return 하세요.
//		
//arr1 = [1, 5, 7, 2, 9, 13, 10]이고, arr2 = [2, 3, 9, 10, 4, 8, 11] 이면 페어가 없으니 0를 반환합니다.
//arr1 = [1, 4, 1, 3, 5, 6, 10]이고, arr2 = [9, 2, 3, 1, 3, 4, 10] 이면 숫자 3이 페어로 나온 2를 반환합니다.
//
//arr1 = [1, 1, 9, 4, 1, 3, 11]이고, arr2 = [2, 3, 3, 13, 12, 9, 9] 이면 숫자 1이 3번 페어로 나온 1을 반환합니다.
//
//arr1 = [1, 4, 9, 4, 1, 10, 13]이고, arr2 = [11, 13, 9, 3, 1, 9, 1] 이면 페어중에 큰 숫자 9가 나온 2를 반환합니다.
//arr1 = [1, 4, 4, 4, 1, 10, 4]이고, arr2 = [11, 13, 11, 3, 11, 9, 1] 이면 4가 4번 페어가 나온 1을 반환합니다.
//arr1 = [1,2,2,3,2,2,2]이고, arr2 = [4,5,4,5,4,5,4] 이면 4가 4번 페어가 나온 2를 반환합니다.


import java.util.Arrays;

public class Question2 {
	
    public static int solution(int[] arr1, int[] arr2) {
    	//오름차순으로 배열 정렬
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	
    	System.out.println(Arrays.toString(arr1));
    	System.out.println(Arrays.toString(arr2));
    	System.out.println(Arrays.toString(pairInfo(arr1)));
    	System.out.println(Arrays.toString(pairInfo(arr2)));
    	  
    	if(!(isPair(arr1)||isPair(arr2))) {
    		if(!(isPair(arr1)&&isPair(arr2))) {
        		System.out.println("1."+0);
    			return 0;
        	} else if(isPair(arr1)) {
        		System.out.println("2."+1);
        		return 1;
        	} else {
        		System.out.println("3."+2);
        		return 2;
        	}
    	}
    	
    	if((isPair(arr1)&&isPair(arr2))) {
    		//1의 페어가 더 클때
    		if(pairInfo(arr1)[1]>pairInfo(arr2)[1]) {
        		System.out.println("4."+1);
    			return 1;
    		//2의 페어가 더 클때
    		} else if(pairInfo(arr1)[1]<pairInfo(arr2)[1]) {
        		System.out.println("5."+2);
    			return 2;
    		//둘의 페어가 같을 때는 숫자값 비교
    		} else {
    			if(pairInfo(arr1)[0]>pairInfo(arr2)[0]) {
            		System.out.println("6."+1);
    				return 1;
    			} else if(pairInfo(arr1)[0]<pairInfo(arr2)[0]) {
            		System.out.println("7."+2);
    				return 2;
    			//숫자마저 같다면 0리턴
    			} else {
            		System.out.println("8."+0);
    				return 0;
    			}
    		}
    	    //페어가 존재할 때 - 가장 큰 페어일때의 숫자값, 가장 큰 페어의 크기    		
    	}

        return 100;
    }    	
    	//둘다 pair이 존재하는 경우가 아닌 경우
/*    	if((numOfPair(arr1)*numOfPair(arr2))==0) {
        	if(numOfPair(arr1)==0 && numOfPair(arr2)==0) {
        		System.out.println("1."+0);
        		return 0;
        	} else if(numOfPair(arr1)==0) {
        		System.out.println("2."+2);
        		return 2;
        	} else {
        		System.out.println("3."+1);
        		return 1;
        	}
    	}

    	//둘다 pair이 존재하는 경우
    	if((numOfPair(arr1)*numOfPair(arr2))!=0) {
    		//1의 페어가 더 클때
    		if(pairInfo(arr1)[1]>pairInfo(arr2)[1]) {
        		System.out.println("4."+1);
    			return 1;
    		//2의 페어가 더 클때
    		} else if(pairInfo(arr1)[1]<pairInfo(arr2)[1]) {
        		System.out.println("5."+2);
    			return 2;
    		//둘의 페어가 같을 때는 숫자값 비교
    		} else {
    			if(pairInfo(arr1)[0]>pairInfo(arr2)[0]) {
            		System.out.println("6."+1);
    				return 1;
    			} else if(pairInfo(arr1)[0]<pairInfo(arr2)[0]) {
            		System.out.println("7."+2);
    				return 2;
    			//숫자마저 같다면 0리턴
    			} else {
            		System.out.println("8."+0);
    				return 0;
    			}
    		}
    	    //페어가 존재할 때 - 가장 큰 페어일때의 숫자값, 가장 큰 페어의 크기    		
    	}

        return 100;
    }  */
    
    public static boolean isPair(int[] arr) {
    	int now = arr[0]; //현재 탐색중인 수
    	for(int i=1; i<arr.length; i++) {
    		if(now==arr[i]) {
    			return true;
    		} else {
    			now=arr[i];
    		}
    	}
    	return false;
    }
    
//    public static int numOfPair(int[] arr) {
//    	int pairNum = 0;
//    	
//    	int now = arr[0]; //현재 탐색중인 수
//    	int cnt = 1; 
//    	for(int i=1; i<arr.length; i++) {
//    		if(now==arr[i]) {
//    			cnt++;
//    			now=arr[i];
//    			continue;
//    		} else {
//    			now=arr[i];
//    			if(cnt>1) { //중복된 pair들이 있는 경우
//    				pairNum++;
//    			}
//    			cnt = 1;
//    		}
//    	}
//    	
//    	if(cnt!=1) {
//    		pairNum++;
//    	}
//    	
//    	return pairNum;
//    }
    
    //페어가 존재할 때 - 가장 큰 페어일때의 숫자값, 가장 큰 페어의 크기
    public static int[] pairInfo(int[] arr) {
    	
    	int[] ans = new int[2]; //[가장 큰 페어일때의 숫자값, 가장 큰 페어의 크기] 
    	int now = arr[0];
    	int cnt = 1; 
    	int max = 0; //가장 큰 페어의 크기
    	int pairnum = 0; //가장 큰 페어일때의 숫자 값
    	
    	for(int i=1; i<arr.length; i++) {
    		if(now==arr[i]) {
    			cnt++;
    			now=arr[i];
    			continue;
    		} else {
    			now=arr[i];
    			if(cnt>1) { //중복된 pair들이 있는 경우
    				if(cnt>=max) {
    					max = cnt;
    					pairnum = arr[i-1];
    				}
    			}
    			cnt = 1;
    		}
    	}
    	
    	if(cnt!=1) {
			if(cnt>=max) {
				max = cnt;
				pairnum = arr[arr.length-1];
			}
    	}
    	
    	if(max>4) {
    		max = 4;
    	}
    	
    	ans[0] = pairnum;
    	ans[1] = max;
    	return ans;
    }
    
    public static int BiggestPairNum(int[] arr) {
    	for(int i=arr.length-1; i>1; i--) {
    		if(arr[i]==arr[i-1]){
    			return arr[i];
    		}
    	}
    	return 0;
    }
    
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = {1, 2, 3, 4, 5, 5, 6};
		solution(arr1,arr2);
	}
}
