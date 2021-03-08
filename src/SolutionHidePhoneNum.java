
public class SolutionHidePhoneNum {

	public String solution(String phone_number) {
        String answer = "";
        if (phone_number.length() > 3) {
        	for (int i=0; i<phone_number.length()-4; i++) {
        		answer = answer.concat("*");
        	}
        }
        answer = answer.concat(phone_number.substring(phone_number.length()-4, phone_number.length()));
        
        return answer;
    }
}
