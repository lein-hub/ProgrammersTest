
public class SolutionNumberOf124World {
	public static void main (String[] args) {
		int n = 39;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
        String answer = "";
        
        while (n>0) {
        	String num = "";
        	if (n%3 == 0) {
        		num = "4";
        		n = n/3 -1;
        	} else {
        		num = String.valueOf(n%3);
        		n = n/3;
        	}
        	
        	answer = num + answer;
        	
        	
        }
        
        return answer;
    }
}
