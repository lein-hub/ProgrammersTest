import java.util.*;

public class Yolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ddd();
	}
	
	public static Scanner input = new Scanner(System.in);
	
	public static void ddd() {
		String str = new String("a123");
		char a='a';
		str.charAt(2);
		System.out.println(str.charAt(2));
	}
	
	public static int[] copyArray(int[] original, int nth) {
		int[] replica = new int[nth+1];
		for (int n=0;n<nth+1;n++) {
			replica[n]=original[n];
		}
		return replica;
	}

}
