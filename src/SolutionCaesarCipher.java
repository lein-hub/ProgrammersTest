
public class SolutionCaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'G';
		char z = 'a';
		System.out.println((int)a);
		System.out.println((int)z);
		String test = "Z";
		int n = 7;
		System.out.println(solution(test, n));

	}
	
	public static String solution(String s, int n) {
        String answer = "";
        
        for (int i=0 ; i<s.length(); i++) {
        	if (s.charAt(i) != 32) {
        		if (((s.charAt(i) >= 97 && s.charAt(i) <= 122)&&(s.charAt(i)+n >= 97 && s.charAt(i)+n <= 122)) || (s.charAt(i) >= 65 && s.charAt(i) <= 90)&&(s.charAt(i)+n >= 65 && s.charAt(i)+n <= 90))
        			answer += (char)((int)s.charAt(i)+n);
        		else
        			answer += (char)((int)s.charAt(i)-(26-n));
        	}
        	else
        		answer += ' ';
        }
        
        return answer;
    }

}
