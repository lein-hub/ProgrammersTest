
public class SolutionPandY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean solution(String s) {
        boolean answer = true;
        int pCount = 0, yCount = 0;
        for (int i=0; i<s.length(); i++) {
        	if (s.charAt(i) == 'p' || s.charAt(i) == 'P') 
        		pCount++;
        	else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
        		yCount++;
        }
        
        if (pCount != yCount)
        	return answer = false;
        return answer;
    }

}
