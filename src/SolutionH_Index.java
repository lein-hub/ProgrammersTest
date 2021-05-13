
public class SolutionH_Index {
	public static void main(String[] args) {
		
	}
	
	public int solution(int[] citations) {
        for (int i=citations.length; i>0; i--) {
        	int breakCount = 0;
        	int idxStack = 0;
        	for (int j=0; j<citations.length; j++) {
        		if (citations[j] < i) {
        			breakCount++;
        			if (breakCount > citations.length - i) break;
        		} else {
        			idxStack++;
        			if (idxStack >= i) return i;
        		}
        	}
        }
        return 0;
    }
}
