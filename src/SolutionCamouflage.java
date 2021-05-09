import java.util.HashMap;
import java.util.Map;

public class SolutionCamouflage {
	public static void main(String[] args) {
		String[][] c = 	{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		System.out.println(solution(c));
	}
	
	public static int solution(String[][] clothes) {
        int answer = 0;
        int combi = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i<clothes.length; i++) {
        	String key = clothes[i][1];
        	Integer value = map.get(key);
        	map.put(key, value == null ? 1:value+1);
        }
        for (Integer n : map.values()) {
        	answer += n;
        }
        if (map.values().size()>1) {
        	for (int i=0; i<map.values().size(); i++) {
        		for (Integer n : map.values()) {
                	answer += n;
                }
        	}
        }
        
        return answer;
    }
}
