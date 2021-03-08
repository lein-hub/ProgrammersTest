import java.util.Arrays;
public class SolutionTaisougi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		int[] lost = {2, 4,8,10,11,25};
		int[] reserve = {1,3,5,11,14,25,30};
		
		System.out.println(solution(n, lost, reserve));

	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0, meaningless = 0;
        for (int i=0; i<reserve.length; i++) {
        	for (int j=0; j<lost.length; j++) {
        		if (reserve[i]==lost[j]) {
        			reserve[i]=-1;
        			lost[j]=-1;
        			meaningless++;
        			break;
        		}
        	}
        }
        
        Arrays.sort(lost);
        
        for (int i=0; i<reserve.length; i++) {
        	if (reserve[i]==-1)
        		continue;
        	for (int j=reserve[i]-1; j<=reserve[i]+1; j++) {
        		if (Arrays.binarySearch(lost, j) < 0) {
        			continue;
        		} else {
        			lost[Arrays.binarySearch(lost, j)] = -1;
        			answer++;
        			Arrays.sort(lost);
        			break;
        		}
        	}
        }
        
        return answer += n - lost.length + meaningless;
	}
}
