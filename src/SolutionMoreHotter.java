import java.util.PriorityQueue;

public class SolutionMoreHotter {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 9, 10, 12};
		System.out.println(solution(arr, 7));
	}
	
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int a : scoville)
        	pq.add(a);
        while (pq.peek() < K) {
        	if (pq.size() == 1) return -1;
        	int cool1 = pq.poll();
        	int cool2 = pq.poll();
        	
        	pq.add(cool1 + (2*cool2));
        	answer++;
        }
        
		return answer;
    }
}
