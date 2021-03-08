import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		//testDoWhile2();
		//gcd();
		//testFor();
		//cycleTest();
		//testFor2();
		//testFactorial();
		//testDivisor();
		//sumRandomNumber();
		//testNestedLoop();
		//findPrimeNum();
		//aaaa();
		//testBreak();
		//testContinue();
		//testContinue2();
		//guessNumber();
		//calcLotto();
		//calcPi();
		//arrayTest();
//		arrayTest2();
//		sequentialSearch();
//		rollDice();
//		reserveSeats();
//		twoDimensionalArray2();
//		aaaaaa();
//		ticTacTo();
//		minSweeper();
//		randomWalk();
		arrayListTest();
		
	}
	
//	1 1245
//	2 15
//	3 
//	4 15
//	5 1245
	public static Scanner input = new Scanner(System.in) ;
	
	public static void arrayListTest() {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		
		list.remove(1);
		list.remove(1);
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(" "+list.get(i));
		}
		System.out.println("\nlist size: "+list.size());
	}
	
	public static void randomWalk() {
		boolean[][] board = new boolean[10][10];
		int steps = 60;
		int i;
		int row = 5;
		int col = 5;
		board[row][col] = true;
		
		
		for (i=0; i<steps ; i++) {
			
			if (row+1>9&&col+1>9) {
				if ((board[row-1][col]==true || row-1<0)&&
					(board[row][col-1]==true || col-1<0)) {
						System.out.println("stucked");
						break;
				}
			} else if (row+1>9&&col-1<0) {
				if ((board[row-1][col]==true || row-1<0)&&
					(board[row][col+1]==true || col+1>9)) {
						System.out.println("stucked");
						break;
				}
			} else if (row-1<0&&col+1>9) {
				if ((board[row+1][col]==true || row+1>9)&&
					(board[row][col-1]==true || col-1<0)) {
						System.out.println("stucked");
						break;
				}
			} else if (row-1<0&&col-1<0) {
				if ((board[row+1][col]==true || row+1>9)&&
					(board[row][col+1]==true || col+1>9)) {
						System.out.println("stucked");
						break;
				}
			} else if (row+1<=9&&row-1>=0&&col+1<=9&&col-1>=0) {
				if ((board[row+1][col]==true)&&
					(board[row-1][col]==true)&&
					(board[row][col+1]==true)&&
					(board[row][col-1]==true)) {
						System.out.println("stucked");
						break;
				}
			} else if (row+1>9) {
				if ((board[row-1][col]==true || row-1<0)&&
					(board[row][col+1]==true || col+1>9)&&
					(board[row][col-1]==true || col-1<0)) {
						System.out.println("stucked");
						break;
				}
			} else if (row-1<0) {
				if ((board[row+1][col]==true || row+1>9)&&
					(board[row][col+1]==true || col+1>9)&&
					(board[row][col-1]==true || col-1<0)) {
						System.out.println("stucked");
						break;
				}
			} else if (col+1>9) {
				if ((board[row+1][col]==true || row+1>9)&&
					(board[row-1][col]==true || row-1<0)&&
					(board[row][col-1]==true || col-1<0)) {
						System.out.println("stucked");
						break;
				}
			} else if (col-1<0) {
				if ((board[row+1][col]==true || row+1>9)&&
					(board[row-1][col]==true || row-1<0)&&
					(board[row][col+1]==true || col+1>9)) {
						System.out.println("stucked");
						break;
				}
			} 
			
					
			
		
			int direction = (int)(4*Math.random());
			if (direction == 0) {
				if (row-1>=0 && board[row-1][col] != true) {
					board[row-1][col] = true;
					row--;
				} else {
					i--;
					continue;
				}
			} else if (direction == 1) {
				if (col+1<=9 && board[row][col+1] != true) {
					board[row][col+1] = true;
					col++;
				} else {
					i--;
					continue;
				}
			} else if (direction == 2) {
				if (row+1<=9 && board[row+1][col] != true) {
					board[row+1][col] = true;
					row++;
				} else {
					i--;
					continue;
				}
			} else if (direction == 3) {
				if (col-1>=0 && board[row][col-1] != true) {
					board[row][col-1] = true;
					col--;
				} else {
					i--;
					continue;
				}
			}
			System.out.println("v"+"steps"+(i+1)+"v");
			for (int i1=0;i1<board.length;i1++) {
				for (int j=0;j<board[i1].length;j++) {
					if (board[i1][j]) {
						System.out.print(" # ");
					}
					else {
						System.out.print(" . ");
					}
				}
				System.out.println();
			}
			
		}
		if (i==steps) {
			System.out.println("congratulations");
		}
	}
	
	public static void minSweeper() {
		boolean[][] board = new boolean[10][10];
		
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board[i].length;j++) {
				double val = Math.random();
				if (val < 0.3) {
					board[i][j] = true;
				}
			}
		}
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board[i].length;j++) {
				if (board[i][j]) {
					System.out.print(" # ");
				}
				else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ticTacTo() {
		char[][] board = new char[3][3];
		int turn=1;
		initialize(board);
		int cresult = 0;
		while (true) {
			while (turn==1) {
				if (playTic(board, turn)) {
					continue;
				}
				
				turn=2;
			}
			cresult = checkBingo2(board);
			if (cresult !=0) {				
				break;
			}
			
			while (turn==2) {		
				if (playTic(board,turn)) {
					continue;
				}
				
				turn=1;
			}
			cresult = checkBingo2(board);
			if (cresult!=0) {				
				break;
			}
		}
		printBoard(board);
		if (cresult==1) {
			System.out.println("Player1 is win");
		} else if (cresult==2) {
			System.out.println("Player2 is win");
		} else if (cresult==3) {
			System.out.println("Withdraw");
		}
	}
	
	public static int checkBingo2(char[][] board) {
		int result=0, stacks=0;
		if (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O') {
			result=1;
			return result;
		}else if (board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X') {
			result=2;
			return result;
		}
		if (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') {
			result=1;
			return result;
		}else if (board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X') {
			result=2;
			return result;
		}
		if (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O') {
			result=1;
			return result;
		}else if (board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X') {
			result=2;
			return result;
		}
		if (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O') {
			result=1;
			return result;
		}else if (board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X') {
			result=2;
			return result;
		}
		if (board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O') {
			result=1;
			return result;
		}else if (board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X') {
			result=2;
			return result;
		}
		if (board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O') {
			result=1;
			return result;
		}else if (board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X') {
			result=2;
			return result;
		}
		if (board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O') {
			result=1;
			return result;
		}else if (board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X') {
			result=2;
			return result;
		}
		if (board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O') {
			result=1;
			return result;
		}else if (board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X') {
			result=2;
			return result;
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (board[i][j]==' ') {
					stacks++;
				}
			}
		}
		if (stacks==0) {
			result=3;
			return result;
		}
		return result;
	}
	
	public static int checkBingo(char[][] board) {
		int result=0, stacks1=0, stacks2=0, stacks=0;
		
			for (int i=0; i<3;i++) {							
				for (int j=0; j<3;j++) {
					if (board[i][j]=='O') {
						stacks1++;
					}else if (board[i][j]=='X') {
						stacks2++;
					}					
				}
				if (stacks1==3) {
					result=1;
					return result;
				} else if (stacks2==3) {
					result=2;
					return result;
					
				} else {
					stacks1=0;
					stacks2=0;
				}
			}
			
			for (int j=0; j<3;j++) {
				for (int i1=0; i1<3;i1++) {
					if (board[i1][j]=='O') {
						stacks1++;
					}else if (board[i1][j]=='X') {
						stacks2++;
					}					
				}
				if (stacks1==3) {
					result=1;
					return result;
				} else if (stacks2==3) {
					result=2;
					return result;
				} else {
					stacks1=0;
					stacks2=0;
				}
			}
			
			if (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O') {
				result=1;
				return result;
			}else if (board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X') {
				result=2;
				return result;
			}
			if (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') {
				result=1;
				return result;
			}else if (board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X') {
				result=2;
				return result;
			}
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					if (board[i][j]==' ') {
						stacks++;
					}
				}
			}
			if (stacks==0) {
				result=3;
				return result;
			}
			return result;
	}
	
	public static boolean playTic(char[][] board, int turn) {
		boolean result=false;
		printBoard(board);
		System.out.println("Player "+turn+"'s turn. please input your command.");
		
		if (checkBoard(board, turn)) {
			result=true;
		}
		
		return result;
	}
	
		
	public static boolean checkBoard(char[][] board, int turn) {
		boolean result=false;
		int x=input.nextInt();
		while (x>3||x<1) {
			System.out.println("Invalid command, please input the value between 1~3");
			x=input.nextInt();
		}
		int y=input.nextInt();
		while (y>3||y<1) {
			System.out.println("Invalid command, please input the value between 1~3");
			y=input.nextInt();
		}
		if (board[x-1][y-1]!=' ') {
			System.out.println("Can't mark there, please input another command");
			result=true;
		} else if (turn==1) {
			board[x-1][y-1]='O';
		} else if (turn==2) {
			board[x-1][y-1]='X';
		}
		return result;
	}
	
	public static void initialize(char[][] board) {
		for (int i=0; i<board.length;i++) {
			for (int j=0; j<board[i].length;j++) {
				board[i][j]=' ';
			}
		}
	}
	
	public static void printBoard(char[][] board) {
		for (int i=0; i<board.length;i++) {
			for (int j=0; j<board[i].length;j++) {
				System.out.print(" "+board[i][j]);
				if (j<board.length-1) {
					System.out.print(" |");
				}
			}
			System.out.println();
			if (i!=2) {			
				System.out.println("---|---|---");
			}
		}
	}
	
	public static void aaaaaa() {
		ArrayList<Integer> testa = new ArrayList<Integer>();
		testa.add(1);
		testa.add(1);
		testa.add(1);
		testa.add(1);
		testa.add(1);
		testa.add(1);
		testa.add(1);
		for (int i : testa) {
			System.out.print(i+" ");
		}
	}
	
	public static void twoDimensionalArray2() {
		int[][] ja = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
//		for (int i=0;i<ja.length;i++) {
//			for (int j=0;j<ja[i].length;j++) {
//				System.out.print(ja[i][j]+" ");
//			}
//			System.out.println();
//		}
		for (int i=0;i<ja.length;i++) {
			System.out.println(printArray(ja[i]));
		}
	}
	
	public static String printArray(int[] arr) {
		String result = "[";
		for (int i=0;i<arr.length-1;i++) {
			result += arr[i] + ", ";
		}
		result+=arr[arr.length-1]+"]";
		
		return result;
	}
	
	public static void twoDimensionalArray() {
		int[][] ja = new int [2][10];
		
//		System.out.println(ja.length);
//		System.out.println(ja[0].length);
		
		for (int i = 0 ; i<ja.length ; i++) {
			System.out.print("["+i+"]: ");
			for (int j=0; j<ja[i].length; j++) {
				ja[i][j] = (int)(1+100*Math.random());
				System.out.print(ja[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void reserveSeats() {
		int[] seat = new int[10];
		int res;
		while (true) {			
			System.out.println("예약할 좌석번호를 입력하십시오. (종료: 0)");
			res=input.nextInt();
			if (res<1) {
				break;
			}
			if (seat[res-1]==0) {
				seat[res-1]=1;			
				System.out.println("예약되었습니다.");
			} else {
				System.out.println("이미 예약된 자리입니다.");
			}
			
		}
		System.out.println("예약현황");
		for (int i=0;i<10;i++) {
			System.out.print(i+1+" ");			
		}
		System.out.print("\n");
		for (int i : seat) {
			System.out.print(seat[i]+" ");			
		}
	}
	
	public static void rollDice() {
		int[] eyes = new int[6];
		
		for (int i=0; i<10000; i++) {
			eyes[(int)(6*Math.random())]++;
		}
		System.out.println(Arrays.toString(eyes));
	}
	
	public static void sequentialSearch() {
		int[] source = new int[10];
		int value, i;
		boolean find=false;
		
		for (i=0;i<source.length;i++) {
			source[i] = (int)(1+10*Math.random());
		}
		System.out.println("찾을 값을 입력하십시오..");
		value=input.nextInt();
		
		for (i=0;i<source.length;i++) {
			if (source[i]==value) {
				System.out.print(i+1+" ");
				find=true;
			}
		}
		if (find) {
			System.out.println("번째에 있습니다.");			
		} else {
			System.out.println("입력한 값을 찾을 수 없습니다.");
		}
		System.out.println(Arrays.toString(source));
	}
	
	public static void arrayTest2() {
		int i;
		String[] sarr = new String[5];
		for (i=0;i<sarr.length;i++) {
			sarr[i]=input.nextLine();
		}
		System.out.println(Arrays.toString(sarr));
		for (i=0;i<sarr.length;i++) {
			System.out.print(sarr[i]+" ");
		}
	}
	
	public static void arrayTest() {
		int size, sum=0, max, min, i;
		System.out.println("과목 수를 입력하십시오.");
		size = input.nextInt();
		int[] arr = new int[size];
		for (i=0;i<size;i++) {
			System.out.print(i+1+"번째 과목의 점수를 입력하십시오.");
			arr[i]=(int)(100*Math.random());
			sum+=arr[i];
			System.out.println("\t\t"+arr[i]+"점");
		}
		max=arr[0];
		min=arr[0];
		for (i=0;i<size;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("\n"+size+"개의 과목 점수 평균은"+"\t\t\t"+(double)sum/size+"점 입니다.");
		System.out.println(size+"개의 과목 점수 중 가장 큰 점수는"+"\t\t"+max+"점 입니다.");
		System.out.println(size+"개의 과목 점수 중 가장 작은 점수는"+"\t"+min+"점 입니다.");
	}
	public static void calcPi() {
		double pi=0, divisor=1;
		int count=input.nextInt();
		for (int i=0;i<count;i++) {
			pi+=4/divisor;
			divisor+=2;
			pi-=4/divisor;
			divisor+=2;
		}
		System.out.println(pi);
	}
	
	public static void guessNumber() {
		int answer, guess, count=0;
//		Random random = new Random();
//		answer=random.nextInt(1000);
		answer=(int)(1+1000*Math.random());
		while (true) {
			guess=input.nextInt();
			count++;
			if (guess==answer) {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수: "+count);
				break;
			} else if (guess<answer) {
				System.out.println("더 큰 수 입니다.");
			} else {
				System.out.println("더 작은 수 입니다.");
			}
		}
	}
	
	public static void calcLotto() {
		double son=45, mom=1, per=1;
		for (int i=0;i<6;i++) {
			per*=(son-i)/(mom+i);
		}
		System.out.println(100/per+"%");
	}
	
	public static void testContinue2() {
		int sum=0;
		String text="no news is good news";
		System.out.println("문자열의 길이: "+text.length());
		for (int i=0;i<text.length();i++) {
			if (text.charAt(i)!='n') {
				continue;
			}
			sum++;
		}
		System.out.println(sum);
	}
	
	public static void testContinue() {
		for (int i=1;i<=10;i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void testBreak() {
		int total=0, count=0, jumsu;
		while (true) {
			jumsu=0;
			System.out.println("정수를 입력하세요(종료: -1)");
			try {
				jumsu=input.nextInt();				
			} catch(Exception e) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			if (jumsu<0) {
				break;
			}
			total+=jumsu;
			count++;
		}
		if (count>0) {
			System.out.println(count+"개 과목의 평균은 "+(double)total/count+"입니다.");	
		} else {
			System.out.println("입력된 점수가 없습니다.");
		}
	}
	
	public static void aaaa() {
		System.out.println();
	}
	
	public static void findPrimeNum() {
		int inp, div, prime;
		inp=input.nextInt();
		for (prime=2;prime<=inp;prime++) {
			for (div=2;div<=prime/2+1;div++) {
				if (prime%div==0&&div!=prime) {
					break;
				}else if (prime/2+1==div) {
					System.out.print(prime+" ");
				}
			}
		}
	}
	
	public static void testNestedLoop() {
		int num, i, j;
		num=input.nextInt();
//		*     
//		**
//		***
//		****
//		*****
		
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num;j++) {
//				if (j<=i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for (i=1;i<=num;i++) {
			for (j=1;j<=num;j++) {
				if (!(j<=i-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num;j++) {
//				if (j<num-i+1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		    *
//	 	   ***
//	 	  *****
//		 *******
//		*********
		
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num;j++) {
//				if (!(j<num-i+1)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			for (j=1;j<=num*2-1;j++) {
//				if (j<i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num*2-1;j++) {
//				if (((j<=num)&&(num-i<j))||((j>num)&&(num+i>j))) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num;j++) {
//				if (!(j<i)) {
//					System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//			}
//			for (j=1;j<=num;j++) {
//				if (j<num-i+1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num*2-1;j++) {
//				if (((j<=num)&&(j>i-1))||((j>num)&&(j<num*2-i+1))) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
//		for (i=1;i<=num-1;i++) {
//			for (j=1;j<=num;j++) {
//				if (!(j<num-i+1)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			for (j=1;j<=num*2-1;j++) {
//				if (j<i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for (i=1;i<=num;i++) {
//			for (j=1;j<=num;j++) {
//				if (!(j<i)) {
//					System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//			}
//			for (j=1;j<=num;j++) {
//				if (j<num-i+1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for (i=1;i<=num;i++) {
			for (j=1;j<=num*2-1;j++) {
				if (((j<=num)&&(num-i<j))||((j>num)&&(num+i>j))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (i=1;i<=num-1;i++) {
			for (j=1;j<=num*2-1;j++) {
				if (((j<=num)&&(j>i))||((j>num)&&(j<num*2-i))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void sumRandomNumber() {
		Random rand = new Random();
		int num, sum=0, i, ran;
		while (true) {
			num=input.nextInt();
			for (i=0;i<num;i++) {
				//ran=(int)(1+100*Math.random());
				ran=rand.nextInt(100)+1;
				sum+=ran;
			}
			System.out.println(sum);
			sum=0;
		}
	}
	
	public static void testDivisor() {
		int n, divisor;
		System.out.println("양의 정수를 입력하십시오.");
		n=input.nextInt();
		while (n<0) {
			System.out.println("양의 정수를 입력하십시오.");
		}
		for (divisor=1;divisor<=n;divisor++) {
			if (n%divisor==0) {
				System.out.print(divisor);
			}
			if (divisor!=n&&n%divisor==0) {
				System.out.print(", ");
			}
		}
		System.out.print("은(는) "+n+"의 약수입니다.");
	}
	
	public static void testFactorial() {
		int end, i;
		long mul=1;
		end=input.nextInt();
		for (i=1;i<=end;i++) {
			mul*=i;
		}
		System.out.println(mul);
	}
	
	public static void testFor2() {
		int start, end, sum=0, orgStart;
		System.out.println("시작 숫자를 입력하십시오.");
		start=input.nextInt();
		System.out.println("끝 숫자를 입력하십시오.");
		end=input.nextInt();
		orgStart=start;
		for (;start<=end;start++) {
			sum+=start;
		}
		while (start<=end) {
			sum+=start;
			start++;
		}
		System.out.println(orgStart+"부터 "+end+"까지의 총 합은 "+sum+" 입니다.");
	}
	
	public static void testDoWhile() {
		int i=10;
		do {
			System.out.println(i++);
		}while(i<3);
	}
	public static void testDoWhile2() {
		int score;
		System.out.println("성적을 입력하십시오");
		do {
			score = input.nextInt();
			if (score>100||score<0) {
				System.out.println("0~100까지의 값을 입력하십시오.");
			}
			else if (score>=90) {
				System.out.println("A");
			}else if (score>=80) {
				System.out.println("B");
			}else if (score>=70) {
				System.out.println("C");
			}else if (score>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}while (true);
	}		
	public static void gcd() {
		int x, y, r, start, tmp;
		System.out.println("두개의 정수를 입력하십시오");
		System.out.print("x: ");
		x=input.nextInt();
		System.out.print("y: ");
		y=input.nextInt();
		start=x*y;
		if (x<y) {
			tmp=x;
			x=y;
			y=tmp;
		}
		while (y!=0) {
			r=x%y;
			x=y;
			y=r;
		}
		System.out.println("최대 공약수는 "+x);
		System.out.println("최소 공배수는 "+start/x);
	}
	public static void cycleTest() {
		int n1, decade, prime, sum, seed, i=0;
		do {
			System.out.println("0~99사이의 수를 입력하십시오");
			n1=input.nextInt();
		} while (n1<0||n1>99);
		seed=n1;
		do {
			if (n1>9) {
				decade=n1/10;
				prime=n1%10;
			}else {
				decade=0;
				prime=n1;
			}
			sum=decade+prime;
			n1=10*prime+sum%10;
			i++;
			System.out.println("n1="+n1+", i="+i);
		} while (n1!=seed);
	}
	public static void testFor() {
		int w=0;
		for (int i=0; i<5; i++) {
			System.out.println(i+1);
		}
		while (w<5) {
			System.out.println(++w);
		}
	}
}
