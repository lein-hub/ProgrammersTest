
public class Solution2016Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10,1));
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        int days = 0;
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        for (int i=1; i<a; i++) {
        	days += monthDays[i-1];
        }
        
        days+=b;
        answer=day[days%7];
        return answer;
    }

}
