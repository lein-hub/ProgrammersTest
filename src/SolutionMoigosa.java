public class SolutionMoigosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		solution(answers);

	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = new int[answers.length];
        int[] b = new int[answers.length];
        int[] c = new int[answers.length];
        int aCount=0,  bCount=0, cCount=0;
        for (int i=0 ; i<answers.length ; i++) {
            a[i] = i%5+1;
            if (i%2 == 0) {
            	b[i] = 2;
            } else if ((i+1)/2%4 == 1){
            	b[i] = 1;
            } else if ((i+1)/2%4 == 0) {
            	b[i] = 5;
            } else {
            	b[i] = (i+1)/2%4+1;
            }
            if (i%10 < 2) {
            	c[i] = 3;
            } else if (i%10 < 4) {
            	c[i] = 1;
            } else if (i%10 < 6) {
            	c[i] = 2;
            } else if (i%10 < 8) {
            	c[i] = 4;
            } else {
            	c[i] = 5;
            }
        }
        
        for (int i=0 ; i<answers.length ; i++) {
        	if (answers[i]==a[i]) {
        		aCount++;
        	}
        	if (answers[i]==b[i]) {
        		bCount++;
        	}
        	if (answers[i]==c[i]) {
        		cCount++;
        	}
        }
        if (aCount == bCount && aCount == cCount) {
        	answer = new int[3];
    		answer[0] = 1;
    		answer[1] = 2;
    		answer[2] = 3;
    		return answer;
        } else if (aCount == bCount && aCount > cCount) {
        	answer = new int[2];
    		answer[0] = 1;
    		answer[1] = 2;
    		return answer;
        } else if (aCount == cCount && aCount > bCount) {
        	answer = new int[2];
    		answer[0] = 1;
    		answer[1] = 3;
    		return answer;
        } else if (bCount == cCount && bCount > aCount) {
        	answer = new int[2];
    		answer[0] = 2;
    		answer[1] = 3;
    		return answer;
        } else if (aCount > bCount && aCount > cCount) {
        	answer = new int[1];
    		answer[0] = 1;
    		return answer;
        } else if (bCount > aCount && bCount > cCount) {
        	answer = new int[1];
    		answer[0] = 2;
    		return answer;
        } else {
        	answer = new int[1];
    		answer[0] = 3;
    		return answer;
        }
    }

}
