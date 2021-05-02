import java.util.ArrayList;
import java.util.Stack;

public class SolutionFunctionDevelopment {
	public static void main(String[] args) {
		int[] array = {99, 99, 99};
		int[] array2 = {1, 11, 1};
		for (int a : solution(array, array2)) System.out.print(a+" ");
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int latency = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<progresses.length; i++) {
        	int days = (int)Math.ceil(((100-progresses[i])/(double)speeds[i]));
        	if (stack.empty()) latency = days;
        	if (stack.empty() || latency >= days) {
        		stack.add(days);
        	} else {
        		list.add(stack.size());
        		stack.clear();
                latency=days;
        		stack.add(days);
        	}
        }
        if (!stack.empty()) list.add(stack.size());
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
