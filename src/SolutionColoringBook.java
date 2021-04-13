import java.util.Stack;

public class SolutionColoringBook {
	int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    Stack<Pointer> stack = new Stack<>();
    boolean[][] isVisited;
    int size;
    
	public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        
        
        isVisited = new boolean[m][n];
        
        for (int i=0; i<m; i++) {
        	for (int j=0; j<n; j++) {
        		if (picture[i][j] != 0 && isVisited[i][j] != true) {
        			size=1;
        			check(i, j, picture, m, n);
        			numberOfArea++;
        		}
        		if (maxSizeOfOneArea < size) maxSizeOfOneArea = size;
        	}
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
	
	public void check(int nx, int ny, int[][] picture, int x, int y) {
		stack.add(new Pointer(nx, ny));

		isVisited[nx][ny] = true;
		
		while (!stack.empty()) {
			Pointer p = stack.pop();
			for (int i=0; i<4; i++) {
				int dm = p.x + dx[i];
				int dn = p.y + dy[i];
				
				if (dm >= 0 && dm < x && dn >= 0 && dn < y) {
					if (picture[dm][dn] == picture[p.x][p.y] && isVisited[dm][dn] != true) {
						stack.add(new Pointer(dm, dn));
						isVisited[dm][dn] = true;
						size++;
					}
				}
			}
		}
	}
	
	static class Pointer {
		int x;
		int y;
		public Pointer(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
