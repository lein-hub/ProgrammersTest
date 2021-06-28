
public class SolutionRotateEdge {
	public static void main(String[] args) {
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

//		int[][] queries = {{1,1,100,97}};
		int[] result = solution(6,6,queries);
		
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] table = new int[rows][columns];
        
        for (int i=0; i<rows; i++) {
        	for (int j=0; j<columns; j++) {
        		table[i][j] = i*columns+j+1;
        	}
        }
        rotate(table, queries, answer);
        return answer;
    }

	private static void printTable(int[][] table) {
		for (int i=0; i<table.length; i++) {
        	for (int j=0; j<table[i].length; j++) {
        		if (table[i][j]<10) {
            		System.out.print(table[i][j] + " , ");
        		} else {
        			System.out.print(table[i][j] + ", ");
        		}
        	}
        	System.out.println();
        }
		System.out.println();
	}

	private static void rotate(int[][] table, int[][] queries, int[] answer) {
		int temp;
		int temp2;
		for (int i=0; i<queries.length; i++) {
			int x1 = queries[i][1] - 1;  // 0
			int y1 = queries[i][0] - 1;  // 0
			int x2 = queries[i][3] - 1;  // 96
			int y2 = queries[i][2] - 1;  // 99
			temp = table[y1][x2];
			temp2 = temp;
			
			for (int a=0; a<x2-x1; a++) {
				table[y1][x2-a] = table[y1][x2-a-1];
				if (temp > table[y1][x2-a]) {
					temp = table[y1][x2-a];
				}
//				printTable(table);
			}
			
			
			
			for (int a=0; a<y2-y1; a++) {
				table[y1+a][x1] = table[y1+a+1][x1];
				if (temp > table[y1+a][x1]) {
					temp = table[y1+a][x1];
				}
//				printTable(table);
			}
			
			
			for (int a=0; a<x2-x1; a++) {
				table[y2][x1+a] = table[y2][x1+a+1];
				if (temp > table[y2][x1+a]) {
					temp = table[y2][x1+a];
				}
//				printTable(table);
			}
			
			
			
			for (int a=0; a<y2-y1; a++) {
				if (a == y2-y1-1) {
					table[y2-a][x2] = temp2;
				} else {
					table[y2-a][x2] = table[y2-a-1][x2];
				}
				if (temp > table[y2-a][x2]) {
					temp = table[y2-a][x2];
				}
				printTable(table);
			}
			
			printTable(table);
			
			
			answer[i] = temp;
		}
	}
}
