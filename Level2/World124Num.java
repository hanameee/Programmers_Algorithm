package Level2;

import java.util.Arrays;

public class World124Num {
	
	  public static String solution(int n) {
	      String ans = "";
	      
		  int idx = arr124(n)[0];
		  int num = arr124(n)[1];
		  
		  System.out.println(idx);
		  System.out.println(num);
   
		  //1. num/Math.pow(3,idx) - 0=1 1=2 2=4
		  //2. num = num%Math.pow(3,idx)
		  //3. idx--
		  //4. 1번반복. 언제까지? num<3일때까지
		  
		  int[] answer = new int[idx+1];
		  
		  if(idx==0) {
			  int a = num%3;
			  if(a==1) {
				  answer[idx] = 1;
			  } else if(a==2) {
				  answer[idx] = 2;
			  } else if(a==0){
				  answer[idx] = 4;
			  }
			  
	      for(int i : answer) {
	    	  ans += i;
	      }
	      System.out.print(ans);
	      return ans;			    
		  }
		  
		  for(int i=idx; i>=0; i--) {
			  int a = (int)(num/Math.pow(3, i));
			  //1.
			  if(a==0) {
				  answer[idx-i] = 1;
			  } else if(a==1) {
				  answer[idx-i] = 2;
			  } else if(a==2){
				  answer[idx-i] = 4;
			  }
			  
			  //2.
			  num = (int)(num%Math.pow(3, i));
		  }			  
		  


	      for(int i : answer) {
	    	  ans += i;
	      }
	      System.out.print(ans);
	      return ans;
	      
	  }

	  
	 public static int[] arr124(int x) {
		 int[] arr = new int[2];
	     int temp = 0;
	     int i = 0;
	     
	     if(x<=3) {
	    	 arr[0] = 0;
	    	 arr[1] = x%3;
	    	 return arr;
	     }
	     
	     while(temp+Math.pow(3,i+1)<=x) {
	    	 temp += (int)Math.pow(3, i+1);
	    	 i++;	    	 
	     }
	     
		 arr[0] = i;
		 arr[1] = x-temp-1;
		 
		 return arr;
	 }
	 
	public static void main(String[] args) {
		int n = 100;
		solution(n);

	}

}
