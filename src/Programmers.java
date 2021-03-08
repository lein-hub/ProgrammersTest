import java.util.Arrays;

public class Programmers {
	public static void main (String[] args) {
		System.out.println(solution("1234"));
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        if (s.length()!=4&&s.length()!=6) {
            answer=false;
        }
        for (int i=0; i<s.length(); i++) {
            if ((int)s.charAt(i)<48||(int)s.charAt(i)>57) {
            	answer=false;
            }
        }
        
        return answer;
    }
}