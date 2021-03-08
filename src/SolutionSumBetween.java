
public class SolutionSumBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public long solution(int a, int b) {
        long answer = 0;
        if (a<b) {
        	for (int i=a; i<=b; i++) {
        		answer+=i;
        	}
        } else {
        	for (int i=b; i<=a; i++) {
        		answer+=i;
        	}
        }
        Math.min(a, b);
        Math.min(a, b);
        return answer;
    }

}
