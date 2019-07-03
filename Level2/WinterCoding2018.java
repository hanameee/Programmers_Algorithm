package Level2;


public class WinterCoding2018 {
	
	public static int solution(String skill, String[] skill_trees) {

//		String skill = "CBD";
//		String[] skill_trees = {"BACDE","CBADF","AECB", "BDA"};

		char[] skillArr = skill.toCharArray();

		for(int i=0; i<skill_trees.length; i++) { //스킬트리 갯수만큼 탐색
			int[] cnt = new int[skill_trees[i].length()]; //탐색할 스킬트리 사이즈 만큼의 int 배열
			char[] sktArr = skill_trees[i].toCharArray(); //탐색할 스킬트리 요소 사이즈의 char 배열. 맨 처음은 {B,A,C,D,E}
			for(int j=0; j<skill_trees[i].length(); j++) { //스킬트리 한 요소의 한 알파벳씩 탐색. 맨 처음은 B
				for(int a=0; a<skillArr.length; a++) { //skill 글자 하나씩 가져와서
					if(skillArr[a] == sktArr[j]) { //알파벳 하나가 그 skill 글자랑 같으면
						cnt[j]++; //카운트를 늘린다
					}
				} //한 알파벳 검증 완료
			} //스킬트리 한 요소 검증 완료
			
			//cnt배열에서 0인 애들은 볼 필요 없으니, cnt 배열의 인덱스 정보를 가지고 skill tree를 새롭게 만들어준다
			
			StringBuilder sb = new StringBuilder();

			for(int b=0; b<cnt.length; b++) {
				if(cnt[b]==1) {
					sb.append(sktArr[b]);
				}
			}
			
			skill_trees[i] = sb.toString();		
		}
		//새로운 skill_tree로 변경 완료
		
		for(String plz : skill_trees) {
			System.out.println(plz);
		} 
		
		//이제 조건에 부합하는지 볼 차례
	    int answer = 0;
		for(String st : skill_trees) {
			char[] check = st.toCharArray();
		    int anscnt = 0;
			for(int i=0; i<check.length; i++) {
				if(check[i]==skillArr[i]) {
					anscnt++;
				}
			}
//			System.out.println(anscnt+" "+check.length);
			if(anscnt==check.length) {
				answer++;
			}
		}
		
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
