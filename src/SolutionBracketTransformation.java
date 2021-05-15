import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SolutionBracketTransformation {
	public static void main(String[] args) {
		System.out.println(solution(")("));
	}
	
	public static String solution(String p) {
        String answer = "";
        Deque<Character> queue = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();
        
        for (char c : p.toCharArray()) queue.add(c);
        
        while (!queue.isEmpty())
        answer += seperateSentence(stack, queue);
        
        
        return answer;
    }

	private static String seperateSentence(Stack<Character> stack, Deque<Character> queue) {
		if (queue.isEmpty()) return "";
		String temp = "";
		int c1 = 0, c2 = 0;
		do {
        	char next = queue.poll();
        	temp += next;
        	if (next == ')') c1++;
        	else c2++;
        } while (c1 != c2);
		
    	for (char a : temp.toCharArray()) {
    		if (stack.isEmpty() || !(stack.peek().equals('(') && a == ')'))
    			stack.push(a);
    		else
    			stack.pop();
   		}
    	
    	
   		if (stack.isEmpty()) {
    		return temp + seperateSentence(stack, queue);
    	} else {
    		temp = reverseBracket(temp);
    		stack.clear();
    		temp = "("+ seperateSentence(stack, queue) + ")" + temp ;
    		return temp;
    	}
    	
	}

	private static String reverseBracket(String temp) {
		String result = "";
		if (temp.length()>1) {
			temp = temp.substring(1, temp.length()-1);
			for (char a : temp.toCharArray()) {
				switch (a) {
				case '(':
					result += ')';
					break;
				case ')':
					result += '(';
					break;
				}
			}
			return result;
		} else return "";
	}
}
