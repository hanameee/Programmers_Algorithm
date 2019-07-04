package Level2;

import java.util.ArrayList;
import java.util.Arrays;


class FeatureDevelopment {
	
	static class Feature {
		public int date;
		public int idx;
		
		public Feature(int idx, int progress, int speed) {
			this.idx = idx;
			this.date = (int)Math.ceil(((100-progress)/speed));
		}
	}
	
    public static int[] solution(int[] progresses, int[] speeds) {
  			
    	ArrayList<Integer> fList = new ArrayList<>();
    	ArrayList<Integer> ansList = new ArrayList<>();
    	
    	for(int i=0; i<progresses.length; i++) {
        	int date = (int)Math.ceil(((100-progresses[i])/speeds[i]));
    		fList.add(date);
    	}
    	
    	int currentDate = fList.get(0);
    	int cnt = 1;
    	for(int i=1; i<fList.size(); i++) {
        		if(fList.get(i)<currentDate) { //지금 보는 애가 currentDate보다 작을 경우 (배포못함)
        			cnt++;
        			if(i==fList.size()-1) {
        				ansList.add(cnt); //마지막 애라면 배포
        			}
        		}else {
        			ansList.add(cnt); //지금 보는 애가 currentDate보다 클 경우 (배포함)
        			currentDate = fList.get(i);
        			cnt=1;
        			if(i==fList.size()-1) {
        				ansList.add(cnt); //마지막 애라면 배포
        			}
        		}  			
    		}
    	
    	int[] a = new int[ansList.size()];
    	for(int i=0; i<a.length; i++) {
    		a[i] = ansList.get(i).intValue();
    	}
    	
    	System.out.println(Arrays.toString(a));
    	return a;	
    	
    	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speed =  {60, 1, 30, 5 , 10, 7};
		solution(progresses,speed);
	}

}
