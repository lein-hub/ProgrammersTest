
public class SolutionFindKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String solution(String[] seoul) {
		int n = -1;
        String answer = "";
        
        for (int i=0; i<seoul.length; i++) {
        	if (seoul[i].equals("Kim")) {
        		n = i;
        		break;
        	}
        }
        return answer += ("김서방은 "+n+"에 있다");
    }

}
