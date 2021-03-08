import java.util.Arrays;

public class SolutionIncompleteParticipant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));

	}
	
//	public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        boolean isComplete = false;
//        for (int i=0; i<participant.length; i++) {
//        	for (int j=0; j<completion.length; j++) {
//        		if (completion[j] == participant[i]) {
//        			isComplete = true;
//        		}
//        	}
//        	if (!(isComplete)) {
//        		answer += participant[i];
//        	}
//        }
//        return answer;
//    }
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i=0; i<completion.length; i++) {
        	if (!completion[i].equals(participant[i])) {
        		answer += participant[i];
        		break;
        	}
        }
        if (answer == "") {
        	return answer += participant[participant.length-1];
        }
        return answer;
    }

}
