import java.util.ArrayList;

public class SolutionCrane {
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
				};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
        int temp = 0, score = 0;
        
        ArrayList<Integer> conveyor = new ArrayList<>();
        
        for (int h=0; h<moves.length; h++) {
        	for (int i=0; i<board.length; i++) {
        		if (board[i][moves[h]-1]!=0) {
        			conveyor.add(board[i][moves[h]-1]);
        			board[i][moves[h]-1] = 0;
        			break;
        		}
        	}
        }
        
        for (int i=0; i<conveyor.size();i++) {
        	if (temp==conveyor.get(i)) {
        		conveyor.remove(i);
        		conveyor.remove(i-1);
        		score+=2;
        		i=-1;
        	}
        	temp=conveyor.get(i);       	
        }
        
//        for (int i=0; i<conveyor.size();i++) {
//        	if (i!=conveyor.size()-1) {
//        		if (conveyor.get(i)==conveyor.get(i+1)) {
//        			conveyor.remove(i);
//        			conveyor.remove(i);
//        			score+=2;
//        			i-=1;
//        		}
//        	}
//        }
        return score;
    }

}
