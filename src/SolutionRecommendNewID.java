import java.util.*;

public class SolutionRecommendNewID {
	public static void main(String[] args) {
		String id = "abcdefghijklmn.p";
		
		System.out.println(solution(id));
	}
	
	public static String solution(String new_id) {
        String answer = "";
        
//        answer = answer.toLowerCase();
//        
//        for (int i=0; i<answer.length(); i++) {
//        	if (!(	(answer.charAt(i)>='a' && answer.charAt(i)<='z') ||
//        			(answer.charAt(i)>='0' && answer.charAt(i)<='9') ||
//        			(answer.charAt(i) == '-' || answer.charAt(i) == '_' || answer.charAt(i) == '.'))) {
//        		answer = answer.substring(0, i) + answer.substring(i+1);
//        		i--;
//        	}
//        }
//        
//        for (int i=1; i<answer.length(); i++) {
//       		if (answer.charAt(i-1) == answer.charAt(i) && answer.charAt(i) == '.') {
//       			answer = answer.substring(0, i) + answer.substring(i+1);
//       			i--;
//       		}
//       	}
//        
//        if (answer.charAt(0) == '.')
//        	answer = answer.substring(1);
//        
//        if (answer.charAt(answer.length()-1) == '.')
//        	answer = answer.substring(0, answer.length()-1);
//        
//        if (answer.isEmpty())
//        	answer = "a";
//        
//        if (answer.length() > 15) {
//        	answer = answer.substring(0, 15);
//        	if (answer.charAt(answer.length()-1) == '.')
//        		answer = answer.substring(0, answer.length()-1);
//        }
//        
//        while (answer.length() < 3) {
//        	answer = answer.concat(String.valueOf(answer.charAt(answer.length()-1)));
//        }

        ArrayList<Character> list = new ArrayList<>();
        
        for (int i=0; i<new_id.length(); i++) {
        	list.add(new_id.charAt(i));
        }
        
        for (int i=0; i<list.size(); i++) {
        	if (Character.isUpperCase(list.get(i)))
        		list.set(i, Character.toLowerCase(list.get(i)));
        }
        
        for (int i=0; i<list.size(); i++) {
        	if (!(	(list.get(i)>='a' && list.get(i)<='z') ||
        			(list.get(i)>='0' && list.get(i)<='9') ||
        			(list.get(i) == '-' || list.get(i) == '_' || list.get(i) == '.'))) {
        		list.remove(i--);
        	}
        }
        
        for (int i=1; i<list.size(); i++) {
        	if (list.get(i-1) == '.' && list.get(i) == '.') {
        		list.remove(i--);
        	}
        }
        
        if (list.get(0) == '.')
        	list.remove(0);
        
        if (list.size()>1 && list.get(list.size()-1) == '.')
        	list.remove(list.size()-1);
        
        if (list.size() == 0)
        	list.add('a');
        
        if (list.size() > 15) {
        	while (list.size() > 15)
        		list.remove(list.size()-1);
        }
        
        if (list.get(list.size()-1) == '.')
        	list.remove(list.size()-1);
        
        if (list.size() < 3) {
        	while (list.size() < 3) {
        		list.add(list.get(list.size()-1));
        	}
        }
        
        for (int i=0; i<list.size(); i++) {
        	answer += list.get(i);
        }
        
        return answer;
    }
}
