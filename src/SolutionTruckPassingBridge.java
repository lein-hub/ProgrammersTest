import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SolutionTruckPassingBridge {
	public static void main(String[] args) {
		int bl = 2;
		int w = 10;
		int[] tw = {7,4,5,6};
		System.out.println(solution(bl, w, tw));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        
       	for (int i = 0; (sum(queue) != 0 || i < truck_weights.length); i++) {
       		answer++;
       		if (i >= truck_weights.length) {
                queue.add(0);
       		}
       		if (queue.size() >= bridge_length) {
       			queue.remove();
       		}
       		if (sum(queue) + truck_weights[i] <= weight) {
       			queue.add(truck_weights[i]);
       		}
       		else {
       			queue.add(0);
       			i--;
       		}
       	}
       	
        return answer;
    }
	
	public static int sum(Deque<Integer> queue) {
		int result = 0;
		for (Object i : queue.toArray()) {
			result += (int) i;
		}
		return result;
	}
	
	
}
