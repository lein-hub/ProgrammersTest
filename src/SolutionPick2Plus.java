import java.util.*;
public class SolutionPick2Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<numbers.length;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (list.indexOf(numbers[i]+numbers[j])<0) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size();i++) {
        	answer[i]=list.get(i);
        }
        Arrays.sort(answer, 0, answer.length);
        return answer;
    }
}
