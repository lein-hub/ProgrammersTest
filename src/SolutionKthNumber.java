import java.util.Arrays;

public class SolutionKthNumber {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {
				{2,5,3},
				{4,4,1},
				{1,7,3}
		};
		System.out.println(Arrays.toString(solution(array, commands)));

	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i<commands.length; i++) {
            int k = 0;
            int[] list = new int[commands[i][1]-commands[i][0]+1];
        	for (int j=commands[i][0]; j<commands[i][1]+1; j++) {
        		
        		list[k++]=array[j-1];
        		}

    		Arrays.sort(list);
    		System.out.println(Arrays.toString(list));
        	answer[i]=list[commands[i][2]-1];
        }
        return answer;
    }

}
