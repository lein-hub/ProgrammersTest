import java.util.ArrayList;
public class SolutionJustDivided {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0 ; i<arr.length ; i++) {
        	if (arr[i]%divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        if (list.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
        list.sort(null);
        answer = new int[list.size()];
        for (int i=0 ; i<list.size() ; i++) {
        	answer[i]=list.get(i);
        }
        
        return answer;
    }

}
