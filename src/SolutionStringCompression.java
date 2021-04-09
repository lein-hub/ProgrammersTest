import java.util.HashMap;

public class SolutionStringCompression {
	public static void main(String[] args) {
		System.out.println(solution("ababcdcdababcdcd"));
	}
	
	public static int solution(String s) {
        int length = s.length();
       	for (int i=1; i<=s.length()/2; i++) {
    	   	HashMap<Integer, Integer> map = new HashMap<>();
    	   	String tempstr = null;
	   		int idx = 0, key = 0, temp = s.length();
	       	for (int j=0; j<s.length()/i; j++) {
	       		String str = s.substring(idx, idx+i);
	       		if (str.equals(tempstr)) map.put(key, map.get(key)+1);
	       		else map.put(++key, 1);
	       		idx += i;
	       		tempstr = str;
	       	}
	       	for (int a : map.values()) if (a > 1) temp -= (i*(a-1))-Math.log10(10*a);
	       	if (length > temp) length = temp;
        }
        return length;
    }
}
