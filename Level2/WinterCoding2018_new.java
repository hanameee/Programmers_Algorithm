package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WinterCoding2018_new {
	
	public static int solution(String skill, String[] skill_trees) {

//		String skill = "CBD";
//		String[] skill_trees = {"BACDE","CBADF","AECB", "BDA"};
		
		ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees)); //list로 바꿔주기
		Iterator<String> it = skillTrees.iterator();
		//Iterator 활용해서 list 값 하나씩 가져오기 - iterator은 remove 해도 자동으로 index를 관리해준다!
		
		while(it.hasNext()) {
			if(skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) !=0) {
				it.remove();
			}
		}
		
	    int answer = skillTrees.size();
	    System.out.println(answer);
	    return answer;
	}
	public static void main(String[] args) {
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE","CBADF","AECB", "BDA"};
		solution(skill,skill_trees);
		//result	2
	}

}
