import java.util.ArrayList;

public class SolutionPonketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
        	if (!list.contains(num)) {
        		list.add(num);
        	}
        }
        
        if (list.size() <= nums.length/2) {
        	return list.size();
        } else {
        	return nums.length/2;
        }
    }

}
